package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("username")).sendKeys("erggfgsfgsg");
driver.findElement(By.name("pwd")).sendKeys("gfjgjhfgjhgjg");
//driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.partialLinkText("password?")).click();
	
	}

}
