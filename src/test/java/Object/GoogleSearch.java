package Object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class GoogleSearch {

	WebDriver driver;
	public GoogleSearch(WebDriver driver) {
		this.driver=driver;
	}
	
	By searchpage=By.name("q");
	By search_btn=By.xpath("//input[@name=\"btnK\"]");
	//By FB_link=By.xpath("//h3[@class='LC20lb']");
	By FB_link=By.partialLinkText("Facebook - log in or sign up");
	
	public void searchbox(String searchinput) throws InterruptedException {
		
		driver.findElement(searchpage).sendKeys(searchinput);
		Thread.sleep(1000);
	}
	public void searchbtn() throws InterruptedException {
		driver.findElement(search_btn).click();
		Thread.sleep(4000);
		
	}
	
	public void facebookclick() throws InterruptedException {
		driver.findElement(FB_link).click();
		Thread.sleep(2000);
	}
}
