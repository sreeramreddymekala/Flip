package objects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ROUGH {
	
	WebDriver driver = new ChromeDriver();
	Actions actions = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	@Test
	void rough() {
		
		driver.get("https://www.flipkart.com/poco-c65-pastel-blue-128-gb/p/itm496cf027e5826?pid=MOBGVVTXTQDGZ7JY&lid=LSTMOBGVVTXTQDGZ7JYJ1XDW1&marketplace=FLIPKART&q=phones&store=tyy%2F4io&srno=s_1_18&otracker=search&otracker1=search&fm=organic&iid=145b7b25-8a87-4c9c-a837-8a10d00e3903.MOBGVVTXTQDGZ7JY.SEARCH&ppt=hp&ppn=homepage&ssid=vam3vy8jkw0000001713455908399&qH=28388ea49f54c5b8");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button/span")).click();
		}
		
		
	
		}
		
		
		
		
		
		

		
		
		
		
	


