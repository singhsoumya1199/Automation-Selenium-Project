package TestScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Object.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethod_GoogleSearch {

	WebDriver driver;
	GoogleSearch object;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		
		driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void searchoperation() throws InterruptedException {
		GoogleSearch gs=new GoogleSearch(driver);
		gs.searchbox("Facebook");
		
	}
	@Test
	public void clickfblink() throws InterruptedException {
		object=new GoogleSearch(driver);
		object.facebookclick();
		
	}
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}
}
