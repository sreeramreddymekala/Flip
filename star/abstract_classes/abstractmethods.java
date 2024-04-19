//package abstract_classes;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class abstractmethods {
//	
//	WebDriver driver;
//	Actions actions = new Actions(driver);
//	public abstractmethods(WebDriver driver) {
//		this.driver = driver;
//		
//	}
//	
//		
//	List<WebElement> options = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//	
//	for(WebElement option:options) {
//		
//		if(option.getText().equalsIgnoreCase("POCO C65 (Pastel Blue, 128 GB)")) {
//			
//			actions.scrollToElement(option).build().perform();
//			option.click();
//			break;
//			
//		}
//	}
//}
//}
	


