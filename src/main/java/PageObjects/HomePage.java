package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Products'][1]")
	WebElement product;
	
	
	public void ClickOnProducts() {
		product.click();
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}

}
