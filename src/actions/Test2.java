package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	 
		WebElement dest = driver.findElement(By.xpath("//h1[text()='Block 4']"));
	 Actions a=new Actions(driver);
	 a.dragAndDrop(src,dest).perform();
	
	
	}
	

}
