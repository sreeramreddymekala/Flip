package objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AC_Scrolling {

	WebDriver driver;
	

	public AC_Scrolling(WebDriver driver) {
		this.driver = driver;
		
	}

	
	
	By item = By.xpath("//div[@class='KzDlHZ']");
	
                                                                     
	public void scrollSelect(String product) {

		List<WebElement> options = driver.findElements(item);

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase(product)) {
				Actions actions = new Actions(driver);
				actions.scrollToElement(option).build().perform();
				option.click();
				break;

			}			
			
		}	
		

	}
	
	public void windowChange() {
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wid.get(1));		
	}
	
	

}
