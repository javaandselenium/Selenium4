package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("email"));
if(ele.isDisplayed()){
	System.out.println("Pass:Element is dispalyed");
	ele.sendKeys("hgjgjhggy");
}
else
{
	System.out.println("ail :element is not dispalyed");
}
driver.close();
	}

}
