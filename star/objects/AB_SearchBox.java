package objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AB_SearchBox {

	WebDriver driver;

	public AB_SearchBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='Pke_EE']") public WebElement searchBox;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span/span") public WebElement inputText;
	


	public void search(String input) {
		searchBox.sendKeys(input);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.ENTER).build().perform();
		String searchedText = inputText.getText();
		assertEquals(input, searchedText);

	}

}
