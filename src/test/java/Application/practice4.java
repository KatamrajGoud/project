package Application;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice4 {


	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstName.sendKeys("katamraj");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("madagoni");
		Thread.sleep(3000);
		WebElement Address=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		Address.sendKeys("H.no.3-136 loyapally pin 501508 ");
		Thread.sleep(3000);
		WebElement Email=driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Email.sendKeys("madagonikatamrajgoud@gmail.com");
		Thread.sleep(3000);
		WebElement number=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		number.sendKeys("7893063160");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("msdd")).click();
		WebElement lamguages=driver.findElement(By.linkText("English"));
		lamguages.click();
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.click();");
		Thread.sleep(3000);
		Select Skills=new Select(driver.findElement(By.id("Skills")));
		Skills.selectByIndex(1);
		Thread.sleep(3000);
		Skills.selectByVisibleText("CSS");
		Thread.sleep(3000);
		Skills.selectByValue("HTML");
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		

	}

}
