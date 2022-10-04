package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_001_Login_Logout {

	

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		//WebDriverManager.Chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("url entered");
		driver.findElement(By.name("email")).sendKeys("swarnanjali");
		driver.findElement(By.name("pass")).sendKeys("nksony019");
		driver.findElement(By.name("login")).click();
		System.out.println("login done");
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
