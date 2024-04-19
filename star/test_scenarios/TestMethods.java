package test_scenarios;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import objects.AB_SearchBox;
import objects.AC_Scrolling;
import objects.AD_Cart;

public class TestMethods {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test(priority = 0)
	public void searching() {
		AB_SearchBox search = new AB_SearchBox(driver);
		search.search("phones");

	}

	@Test(priority = 1)
	public void scrollSelect() {
		AC_Scrolling select = new AC_Scrolling(driver);
		select.scrollSelect("POCO C65 (Pastel Blue, 128 GB)");
		
	}
	@Test(priority = 2)
	public void cartAndPlacing() {
		AC_Scrolling select = new AC_Scrolling(driver);
		select.windowChange();
		AD_Cart cart = new AD_Cart(driver);
		cart.addingToCart();
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
