package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.cssSelector("input[name='username']")).sendKeys("jfghfhgjg");
driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("hghgjg");		
	}

}
