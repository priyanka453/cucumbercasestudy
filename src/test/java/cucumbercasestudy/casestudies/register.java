package cucumbercasestudy.casestudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class register {
	WebDriver driver;
	Select select;
	@Given("^User is in testme app$")
	public void user_is_in_testme_app() throws Throwable {
	    driver=utilityclass.openBrowser("Chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@Given("^click the signup link$")
	public void click_the_signup_link() throws Throwable {
	  driver.findElement(By.linkText("SignUp")).click();
	}

	@Then("^the registration page is displayed$")
	public void the_registration_page_is_displayed() throws Throwable {
	   System.out.println("user is in login page");
	}

	@Then("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String uname) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(uname);
	}

	@Then("^user enters firstname as \"([^\"]*)\"$")
	public void user_enters_firstname_as(String fname) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}

	@Then("^user enters lastname as \"([^\"]*)\"$")
	public void user_enters_lastname_as(String lname) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}

	@Then("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String pass) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^user enters confirm password as \"([^\"]*)\"$")
	public void user_enters_confirm_password_as(String cpass) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}

	@Then("^user selects gender$")
	public void user_selects_gender() throws Throwable {
		driver.findElement(By.xpath("//input[@name='gender' and @value='Female']")).click();
	}

	@Then("^user enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String email) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@Then("^user enters mobile_number \"([^\"]*)\"$")
	public void user_enters_mobile_number(String mno) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(mno);
	}

	@Then("^user enters DOB \"([^\"]*)\"$")
	public void user_enters_DOB(String dob) throws Throwable {
	    driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@Then("^user enters address \"([^\"]*)\"$")
	public void user_enters_address(String add) throws Throwable {
	driver.findElement(By.name("address")).sendKeys(add);
	}

	@Then("^user selects security question$")
	public void user_selects_security_question() throws Throwable {
	   Select select =new Select(driver.findElement(By.name("securityQuestion")));
	   select.selectByIndex(1);
	}

	@Then("^user enters answer \"([^\"]*)\"$")
	public void user_enters_answer(String ans) throws Throwable {
	    driver.findElement(By.name("answer")).sendKeys(ans);
	}

	@Then("^click on register$")
	public void click_on_register() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	    Assert.assertEquals(driver.getTitle(), "Login");
	    driver.close();
	}
}
