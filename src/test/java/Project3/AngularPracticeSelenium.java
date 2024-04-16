package Project3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPracticeSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
 driver=new ChromeDriver();
 driver.get("https://rahulshettyacademy.com/angularpractice/");
 driver.findElement(By.name("name")).sendKeys("Megha");
 driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
 driver.findElement(By.id("exampleInputPassword1")).sendKeys("Megha123");
 driver.findElement(By.id("exampleCheck1")).click();
 Select sel=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
 sel.selectByVisibleText("Female");
 driver.findElement(By.id("inlineRadio1")).click();
 driver.findElement(By.name("bday")).sendKeys("10-11-1111");
 driver.findElement(By.className("btn-success")).click();
 String text=driver.findElement(By.className("alert")).getText();
 
 if(text.contains("submitted")) {
	 System.out.println("submitted");
 }

 driver.findElement(By.xpath("/html/body/app-root/app-navbar/div/nav/ul/li[2]/a")).click();
 List<WebElement> elements=driver.findElements(By.xpath("//app-card[@class=\"col-lg-3 col-md-6 mb-3\"]"));
 WebElement btn=driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]"));
 for (int i = 0; i < elements.size(); i++) {
	 System.out.println(elements.get(i).getText());
	 if(elements.get(i).getText().contains("iphone")) {
		btn.click();
	 }
}
 driver.findElement(By.xpath("//a[@class=\"nav-link btn btn-primary\"]")).click();
 driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys(Keys.ARROW_UP,Keys.RETURN);
 driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
 driver.findElement(By.xpath("//input[@id=\"country\"]")).sendKeys("spn");
 driver.findElement(By.className("checkbox")).click();
 driver.findElement(By.xpath("//input[@value='Purchase']")).click();
String succ= driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText();
if(succ.contains("Success")) {
	System.out.println("successfully done");
}
	
	}
}
