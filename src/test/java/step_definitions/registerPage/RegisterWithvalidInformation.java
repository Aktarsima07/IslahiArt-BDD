package step_definitions.registerPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.example.BDD_IslahiartDemo.RegisterPage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import step_definitions.Hooks;
import io.cucumber.java.Before;
public class RegisterWithvalidInformation {
	
	WebDriver driver;
	RegisterPage register;
	
	
	@Given("User is on webpase {string}")
	public void user_is_on_webpase(String url) {
		driver=Hooks.driver;
		register=new RegisterPage(driver);
		driver.get(url);
	    
	}

	@When("User click Register button")
	public void user_click_register_button() {
	register.clickAccoutButton();	
	    
	}

	@Then("User click Sing Up button")
	public void user_click_sing_up_button() {
		register.clickSignButton();	
	    
	}

	@Then("User enter {string} as Email")
	public void user_enter_as_email(String ema) {
		
	 register.inputEmal(ema);   
	}

	@Then("User enter {string} as First Name {string} as Last Name")
	public void user_enter_as_first_name_as_last_name(String firstname, String lastname) {
		 register.enterFirstname(firstname);  
		 register.enterLastname(lastname);
	}

	@Then("User enter {string} as Password")
	public void user_enter_as_password(String password) {
	  register.inputPassword(password);  
	}

	@Then("User enter {string} as Confirm password")
	public void user_enter_as_confirm_password(String comfirmPassword) {
		register.inputComfirmPassword(comfirmPassword);
	    
	}

	@Then("User accept the privacy Policy")
	public void user_accept_the_privacy_policy() {
	 register.checkAcceptbutton();  
	}

	@Then("User click on Sing Up button")
	public void user_click_on_sing_up_button() {
		register.clickSignupButton();
	    
	}

	@Then("User register successfully")
	public void user_register_successfully() {
		
		Assert.assertEquals(driver.getCurrentUrl(),"https://islahiart.com/my-account/");
		
	}

	/*@After
    public void teardown() {

        driver.quit();
    }*/
}
