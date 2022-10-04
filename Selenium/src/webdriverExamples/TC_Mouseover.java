package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_Mouseover {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("login done");
		Thread.sleep(3000);
		//mouseover
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		System.out.println("Mouseover Completed");
		Thread.sleep(4000);
		//click on Submenu-AddEmployee
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("Clicked on Submenu");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");
		Thread.sleep(3000);
		driver.close();
	}
	
}
		
	