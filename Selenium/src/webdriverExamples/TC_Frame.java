package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frame {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
		System.out.println("Login completed");
		//Enter into frame
		driver.switchTo().frame("rightMenu");
		//Click on Add button
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(300);
		System.out.println("Clicked on Add btn");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("selenium");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("suresh");
		//click on Save btn
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("New emp Added");
		Thread.sleep(3000);
		//Exit from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		Thread.sleep(3000);
		driver.close();

	}

}
