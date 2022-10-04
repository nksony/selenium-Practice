package interview;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario1 {

	public static void main(String[] args) throws Exception {

	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.techctice.com/");
			driver.findElement(By.linkText("Internships")).click();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Know More")).click();
			Thread.sleep(2000);
			Set<String> newWind = driver.getWindowHandles();
			ArrayList<String> ar= new ArrayList<String>(newWind);
			Thread.sleep(2000);
			driver.switchTo().window(ar.get(1));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"popmake-6631\"]/button")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.name("your-fname")).sendKeys("Jitendra Kumar Mallick");
			driver.findElement(By.name("your-phone")).sendKeys("+917008818");
			driver.findElement(By.name("your-email")).sendKeys("jitendramallick@gmail.com");
			driver.findElement(By.xpath("//input[@value='CALL ME NOW']")).click();
			Thread.sleep(2000);
			driver.close();
		 
	}
	}
