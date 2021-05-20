package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/dd.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("Mayas"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("d");
		s.selectByVisibleText("chicken 65");
		
		Thread.sleep(3000);
		s.deselectByIndex(0);
		Thread.sleep(3000);
		s.deselectByValue("d");
		Thread.sleep(3000);
		s.deselectByVisibleText("chicken 65");
		Thread.sleep(3000);
		driver.close();
		
	}

}
