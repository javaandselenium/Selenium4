package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
			
	}

}
