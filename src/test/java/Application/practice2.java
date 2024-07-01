package Application;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class practice2 {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement (By.id("dropdown-class-example"));
		Select select=new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("option2");
		Thread.sleep(3000);
		select.selectByVisibleText("Option3");
		Thread.sleep(3000);
		driver.findElement(By.id("autocomplete")).sendKeys("testingthecode");
		WebElement Radiobtn=driver.findElement(By.name("radioButton"));
		Radiobtn.click();
		driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement Switchalert=driver.findElement (By.id("name"));
		Switchalert.sendKeys("testing");
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement (By.id("name")).sendKeys("testconform");
		driver.findElement (By.id("confirmbtn")).click();
		Thread.sleep(3000);
		alert.dismiss();
		WebElement drop=driver.findElement(By.id("mousehover"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",drop);
		Thread.sleep(3000);
		Actions action=new Actions (driver);
		action.moveToElement(drop).build().perform();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
