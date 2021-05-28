package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
		//WebElement ele = driver.findElement(By.id("email"));
		Login l=new Login(driver);
		driver.navigate().refresh();
		//ele.sendKeys("jhggjshghj");
		l.emailaddresstextbox("ghughghgxhghgxjh");
		l.passwordtxtbox("fjfgzggjhzgjh");
		l.loginButton();
		

	}

}
