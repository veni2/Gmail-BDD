package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^user is present in Login page$")
	public void user_present_in_login_page()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\veni\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	@When("^Title of Login page is Gmail$")
	public void Title_of_Login_Gmail() {
		String title =driver.getTitle();
		System.out.println(title);
		}
	@Then("^user enters username and click on next button$")
	public void user_enters_username_and_click_on_next_button() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("veni5810");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(2000);
		}
	@Then("^user enters password and click on next button$")
	public void user_enters_password_and_click_on_next_button() {
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("javadotnet");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	}
	
	
	
}
