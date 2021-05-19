package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		driver.findElement(By.name("login")).click();
		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'The email address or mobile number')]"));
	System.out.println(ele.getText());
	driver.close();
	
	}

}
