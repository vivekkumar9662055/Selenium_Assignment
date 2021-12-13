package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import testng.Assertion.SoftAssert;
import utilities.selenium.WebDriverManager;

public class NavigateToGoogleWithAssertion {
	
	private static final String CurrentUrl = null;
	WebDriver driver;
	WebDriverManager webDrvMgr;
	SoftAssert ast;
	
	@BeforeClass
	public void setUp(){
		webDrvMgr= new WebDriverManager();
		driver = webDrvMgr.launchBrowser("chrome");
		driver.get("https://www.google.co.in");
	}
	
	@Test
	public void navigateToGoogle() {
	String title= driver.getTitle();
		//System.out.println(title);
	Assert.assertEquals("Google", title);
	//ast.assertEquals(title,"Google");
		
		String url= driver.getCurrentUrl();
		//System.out.println(Currenturl);
		Assert.assertEquals(CurrentUrl,"https://www.google.co.in" );
		
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innerText = oelem.getText();
		//System.out.println(innerText);
		Assert.assertEquals(innerText,"India");
		String attribClass = oelem.getAttribute("Class");
		//System.out.println(attribClass);
		Assert.assertEquals(attribClass,"uU7dJb");
		
		List<WebElement> oList=driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		for(WebElement oElem:oList) {
			String innertext=oElem.getText();
			System.out.println(innertext);
			
		}
		//ast.assertAll();
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
