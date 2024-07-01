package Application;
import java.io.File;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.Workbook;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice9 {

	

	public static void main(String[] args)throws Exception {
		
// ExcelSheet handalig
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/");
		/*FileInputStream file=new FileInputStream(new File("C:\\Users\\hp\\OneDrive\\Desktop.xlsx"));
		Workbook workbook=new HSSFWorkbook(file);
		Sheet sheet=workbook.getSheetAt(0);
		Row row=sheet.getRow(1);
		String username=row.getCell(0).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();*/
		FileInputStream file=new FileInputStream(new File("C:\\Users\\hp\\OneDrive\\Desktop\\Excel.xls"));
		Workbook workbook=new HSSFWorkbook(file);
		Sheet sheet=workbook.getSheetAt(1);
		Row row=sheet.getRow(1);
		String username=row.getCell(1).getStringCellValue();
		String password=row.getCell(1).getStringCellValue();
		WebElement usernameFiled=driver.findElement(By.id("Email"));
		WebElement passwordFiled=driver.findElement(By.id("Password"));
		usernameFiled.clear();
		Thread.sleep(3000);
		 usernameFiled.sendKeys("username");
		 passwordFiled.clear();
		 Thread.sleep(3000);
		 passwordFiled.sendKeys("password");
		 WebElement RememberMe=driver.findElement(By.id("RememberMe"));
		 RememberMe.click();
		 WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		 login.click();
		 WebElement logout=driver.findElement(By.linkText("Logout"));
		 logout.click();
		 driver.close();
		 
		 
		 
		
		
		
		
		
	
		
	}

}
