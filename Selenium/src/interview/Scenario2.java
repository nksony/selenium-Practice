package interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://techctice.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000");
	driver.findElement(By.xpath("//*[@id=\"qlwapp\"]")).click();

	
}
}
