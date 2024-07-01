package Application;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Columns;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practice6 {
	// webtable handling

	public static void main(String[] args)throws Exception {
		System.out.println("katamraj");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		WebElement table=driver.findElement(By.id("product"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0; i<rows.size();i++) {
			WebElement row=rows.get(i);
			List<WebElement> colums=row.findElements(By.tagName("td"));
			for(int j=0; j<colums.size();j++) {
				WebElement colum=colums.get(j);
				System.out.println(colum.getText());
				
			}
			//System.out.println();
			
			
		}
		Thread.sleep(2000);
		driver.close();
		
		
	

	}

}
