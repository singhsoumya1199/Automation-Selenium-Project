package Project3;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		 driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.name("radioButton")).click();
		WebElement ele= driver.findElement(By.id("autocomplete"));
		ele.sendKeys("ind");
		Thread.sleep(2000);
	    List<WebElement> elem=driver.findElements(By.className("ui-menu-item"));
	 
	 for (int i = 0; i <elem.size(); i++) {
		String text=elem.get(i).getText();
		if(text.equalsIgnoreCase("India")) {
		
		elem.get(i).click();
		
	}
	WebElement drop=driver.findElement(By.name("dropdown-class-example"));
	 
	Select sel=new Select(drop);
	sel.selectByVisibleText("Option1");

	
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	System.out.println(checkbox.isEmpty());
	
	
	for (WebElement webElement : checkbox) {
		if(webElement.getText().equalsIgnoreCase("Option1")) {
			checkbox.get(i).click();
		}
	}
}}}
