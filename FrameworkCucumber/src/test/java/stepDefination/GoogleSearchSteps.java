package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver=null;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("inside code-browser is open");

		String projectPath=System.getProperty("user.dir");
		System.out.println("project path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/main/java/Driver file/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("User is on Google search page")
	public void user_is_on_Google_search_page() {
		System.out.println("inside code-user in google search page");

		driver.navigate().to("https://www.google.com/");
	}

	@When("User enter a text on search box")
	public void user_enter_a_text_on_search_box() throws Exception {
		System.out.println("inside code-user enter a text in search box");

		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(2000);
	}

	@And("hits enter button")
	public void hits_enter_button() throws Exception {
		System.out.println("inside code-user hits the enter button");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User is navigate to search result")
	public void user_is_navigate_to_search_result(){
		System.out.println("inside code-user is navigated to search page");

		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}



}
