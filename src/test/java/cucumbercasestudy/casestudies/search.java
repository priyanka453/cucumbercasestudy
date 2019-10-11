package cucumbercasestudy.casestudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class search {
	WebDriver driver;
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
	   driver=utilityclass.openBrowser("Chrome");
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User enters valid credentials and perform login$")
	public void user_enters_valid_credentials_and_perform_login() throws Throwable {
	   driver.findElement(By.linkText("SignIn")).click();
	   driver.findElement(By.name("userName")).sendKeys("lalitha");
	   driver.findElement(By.name("password")).sendKeys("Password123");
	   driver.findElement(By.name("Login")).click();
	}

	@Then("^User enters to Home page$")
	public void user_enters_to_Home_page() throws Throwable {
	    Assert.assertEquals(driver.getTitle(), "Home");
	}

	@Given("^user should be in home page$")
	public void user_should_be_in_home_page() throws Throwable {
	    System.out.println("User is in home page");
	}

	@When("^user enters four letters of product$")
	public void user_enters_four_letters_of_product() throws Throwable {
	   driver.findElement(By.name("products")).sendKeys("head");
	}

	@When("^select product from the list and click on find details$")
	public void select_product_from_the_list_and_click_on_find_details() throws Throwable {
	  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("^user enters to product page$")
	public void user_enters_to_product_page() throws Throwable {
	   Assert.assertEquals(driver.getTitle(), "Search");
	   //driver.close();
	}
	@When("^user add product to cart$")
	public void user_add_product_to_cart() throws Throwable {
	   driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	   Assert.assertEquals(driver.getTitle(), "View Cart");   
	}

	@When("^user checkout the product$")
	public void user_checkout_the_product() throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();//checkout button
  	   Assert.assertEquals(driver.getTitle(), "Cart Checkout");
	}

	@When("^user procced to pay$")
	public void user_procced_to_pay() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Proceed to Pay']")).click();
  	  
	}

	@When("^redirecting to payment gatway$")
	public void redirecting_to_payment_gatway() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Redirecting to Payment Gateway");
		WebDriverWait wait=new WebDriverWait(driver,100);
  	  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/h3"),"Net Banking"));
  	 
	}

	@When("^user select bank$")
	public void user_select_bank() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();
	  	  driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	  	 
	}

	@When("^user enter username and password$")
	public void user_enter_username_as_and_password() throws Throwable {
		 driver.findElement(By.name("username")).sendKeys("123456");
	  	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  	  driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
	}

	@When("^user enter transaction password$")
	public void user_enter_transaction_password() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys("Trans@456");
		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();//paynow
	}

	@When("^user enters in order details$")
	public void user_enters_in_order_details() throws Throwable {
	  	  Assert.assertEquals(driver.getTitle(), "Order Details");
	  	
	}

	@Then("^signout$")
	public void signout() throws Throwable {
		 driver.findElement(By.xpath("/html/body/header/div/div/ul/b/a[2]")).click();
		 driver.close();
	}

	@Given("^user must be in home page$")
	public void user_must_be_in_home_page()
	{
		 Assert.assertEquals(driver.getTitle(), "Home");
	}
	@When("^user enters four letters$")
	public void user_enters_four_letters() {
		driver.findElement(By.name("products")).sendKeys("aaaa");
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Then("^no product name displayed$")
	public void no_product_name_displayed() throws Throwable
	{
		Assert.assertEquals(driver.getTitle(), "Search");
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		driver.close();
		
	}

}
