package TestNgFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBasic {
	WebDriver driver;
	@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();//lunch chrome
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.google.com");	
}
@Test(priority=1)
public void googleTitleTest() {
		String title=driver.getTitle();
	    System.out.println("title");
}
@Test(priority=2)
public void googleLogoTest() {
	 boolean b=driver.findElement(By.xpath("//img[@Class='lnXdpd']")).isDisplayed();
	 
}
@Test(priority=3)
public void mailLinkTest() {
	boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
	
  