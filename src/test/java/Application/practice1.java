package Application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/?tag=hpga1-ubpl-pczz-pzz-in-21");
		//WebElement chaptha=driver.findElement(By.id("captchacharacters"));
		//chaptha.sendKeys("new chaptha");
		import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import io.github.bonigarcia.wdm.WebDriverManager;
		public class practice1{
		
			public static void main(String[] args) throws Exception{
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/#top");
				Thread.sleep(3000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,600)");
				Thread.sleep(3000);
			/*	WebElement table=driver.findElement(By.id("product"));
				List<WebElement> rows=table.findElements(By.tagName("tr"));
				for(int i=0; i<rows.size(); i++) {
					WebElement row=rows.get(i);
					List<WebElement> colums=row.findElements(By.tagName("td"));
					for(int j=0; j<colums.size(); j++) {
						WebElement colum=colums.get(j);
						System.out.println(colum.getText());
					}
					System.out.println();
				}
				Thread.sleep(3000);
				driver.close();*/
			}
				
		}
			
			
			
		