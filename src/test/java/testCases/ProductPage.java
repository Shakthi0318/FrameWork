package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;

public class ProductPage extends BaseClass{
	
	
	@Test
	public void Product_page() {
		
		HomePage p = new HomePage(driver);
		p.ClickOnProducts();
		p.getTitle();
	}

}
