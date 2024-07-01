package Application;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice3 {


	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")),
				driver.findElement(By.id("droppable"))).build().perform();
		Thread.sleep(3000);
				File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\hp\\Downloads\\jqueryui.JPEG"));
		Thread.sleep(3000);
		driver.close();
	
		

	}

}
