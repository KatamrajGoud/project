package Application;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class Flyrobo {
	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flyrobo.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		WebElement FirstName=driver.findElement(By.name("firstname"));
		FirstName.sendKeys("katamraj");
		Thread.sleep(3000);
		WebElement LastName=driver.findElement(By.id("input-lastname"));
		LastName.sendKeys("madagoni");
		Thread.sleep(3000);
		WebElement Email=driver.findElement(By.xpath("//input[@placeholder='E-Mail']"));
		Email.sendKeys("madagonikatamrajgoud@gmail.com");
		Thread.sleep(3000);
		WebElement MobileNo=driver.findElement(By.id("input-telephone"));
		MobileNo.sendKeys("7893063160");
		Thread.sleep(3000);
		WebElement AltNo=driver.findElement(By.xpath("//input[@placeholder='Alternate Mobile No. +91']"));
		AltNo.sendKeys("6301289268");
		Thread.sleep(3000);
		// using javascript scroll down 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		WebElement Password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys("Darling@143.");
		Thread.sleep(3000);
		WebElement conformpwd=driver.findElement(By.xpath("//input[@placeholder='Password Confirm']"));
		conformpwd.sendKeys("Darling@143.");
		Thread.sleep(3000);
		WebElement Subscribe=driver.findElement(By.name("newsletter"));
		Subscribe.click();
		Thread.sleep(3000);
		WebElement agreebox=driver.findElement(By.name("agree"));
		agreebox.click();
		Thread.sleep(3000);
		WebElement con=driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
		con.click();
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(3000);
		WebElement EmailAddress=driver.findElement(By.name("email"));
		EmailAddress.sendKeys("madagonikatamrajgoud@gmail.com");
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.id("input-password"));
		pwd.sendKeys("Darling@143.");
		Thread.sleep(3000);
		WebElement loginApp=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
		loginApp.click();
		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		Thread.sleep(3000);
		driver.close();	
		
	}
}
