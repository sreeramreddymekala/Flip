package objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AD_Cart {
	WebDriver driver;
	
	public AD_Cart(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button") public WebElement cart_btn;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span") public WebElement placeOrder_btn;
	
	
	
	public  void addingToCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cart_btn.click();
		placeOrder_btn.click();
	}
	

}
