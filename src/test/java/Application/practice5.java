package Application;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class practice5 {
	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		WebElement openwindow=driver.findElement(By.id("openwindow"));
		openwindow.click();
		String mainwindow=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		for(String windowhandle : windowhandles) {
			if(!windowhandle.equals(mainwindow)) { 
				driver.switchTo().window(windowhandle);
				Thread.sleep(3000);
				WebElement Aboutus=driver.findElement(By.linkText("About us"));
				Aboutus.click();
				Thread.sleep(3000);
				driver.close();	
			}
		
	}
		driver.switchTo().window(mainwindow);
		driver.findElement(By.id("autocomplete")).sendKeys("testingthecode");
		Thread.sleep(3000);
		driver.findElement(By.id("opentab")).click();
		driver.close();
		
	}

}


