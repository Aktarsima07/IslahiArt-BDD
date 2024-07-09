package com.example.BDD_IslahiartDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	private final WebDriver driver;
	
public  RegisterPage(WebDriver driver) {
	
	
PageFactory.initElements(driver, this);	
this.driver=driver;	
}
@FindBy(xpath="(//a[@href=\"/my-account/\"])[1]")
private WebElement acc;

@FindBy(xpath="//li[text()='Sign Up']")
private WebElement signup;

@FindBy(xpath="(//input[@name='xoo_el_reg_email'])[1]")
private WebElement email;

@FindBy(xpath="(//input[@name='xoo_el_reg_fname'])[1]")
private WebElement firstN;

@FindBy(xpath="(//input[@name = 'xoo_el_reg_lname'])[1]")
private WebElement lastN;

@FindBy(xpath="(//input[@name='xoo_el_reg_pass'])[1]")
private WebElement password;

@FindBy(xpath="(//input[@placeholder='Confirm Password'])[1]")
private WebElement comfirmpassword;

@FindBy(xpath="(//input[@value='yes'])[1]")
private WebElement acceptButton;

@FindBy(xpath="(//button[@class='button btn xoo-el-action-btn xoo-el-register-btn'])[1]")
private WebElement signupButton;


 public void clickAccoutButton() {
	acc.click();
}	

 public void clickSignButton() {
	signup.click();
	}	


public void inputEmal(String em) {
	email.sendKeys(em);
	
}

public void enterFirstname(String firstName) {
	firstN.sendKeys(firstName);
	
}
public void enterLastname(String lastName) {
	lastN.sendKeys(lastName);
	
}
public void inputPassword(String pass) {
	password.sendKeys(pass);
}
public void inputComfirmPassword(String cpass) {
	comfirmpassword.sendKeys(cpass);
}
public void checkAcceptbutton(){
	acceptButton.click();
	}	
public void clickSignupButton() {
	signupButton.click();
	}

}