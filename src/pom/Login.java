package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void emailaddresstextbox(String email) {
		emailaddresstb.sendKeys(email);
	}
	
	public void passwordtxtbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginButton() {
		loginbtn.click();
	}

}
