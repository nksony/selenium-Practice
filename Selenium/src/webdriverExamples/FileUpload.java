package webdriverExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		try {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nareshit");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nareshit");
         driver.findElement(By.name("Submit")).click();
         Thread.sleep(5000);
         driver.switchTo().frame("rightMenu");
         driver.findElement(By.xpath("//input[@value='Add']")).click();
         driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
         driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("last name");
         driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("first name");
          //To upload a file
WebElement fileInput = driver.findElement(By.
                   xpath("//input[@type='file'][@name='photofile']"));                                      
fileInput.sendKeys("");
//fileInput.sendKeys("G:\\06.TestingTools\\1.0.ProjectName\\Templates\\Defect Template.xlsx");
         Thread.sleep(7000);
         System.out.println("File uploaded successfully");            
         driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
         Thread.sleep(9000);
           System.out.println("New Employee Added");
           driver.switchTo().defaultContent();
           driver.findElement(By.linkText("Logout")).click();
           
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			driver.close();
		}
	}

}
