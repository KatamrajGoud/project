package Application;
    //   file upload

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice8 {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(3000);
		WebElement fileupload=driver.findElement(By.id("imagesrc"));
		String path="C:\\Users\\hp\\OneDrive\\Pictures.JPEG";
		fileupload.sendKeys(path);
		Thread.sleep(3000);
		driver.close();
		
}
}