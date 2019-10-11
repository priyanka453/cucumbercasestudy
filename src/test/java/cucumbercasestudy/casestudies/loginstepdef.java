package cucumbercasestudy.casestudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginstepdef {
	WebDriver driver;
	@Given("^user is not logged in$")
	public void user_is_not_logged_in() throws Throwable {
		driver=utilityclass.openBrowser("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    System.out.println("User is in login page");
	}

	@When("^user perform login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_perform_login_using_and(String uid, String pass) throws Throwable {
	   driver.findElement(By.linkText("SignIn")).click();
	   driver.findElement(By.name("userName")).sendKeys(uid);
	   driver.findElement(By.name("password")).sendKeys(pass);
	   driver.findElement(By.name("Login")).click();
	}

	@Then("^user is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	   System.out.println("User logged in successfully");
	   Assert.assertEquals(driver.getTitle(), "Home" );
	   driver.close();
	}


}
