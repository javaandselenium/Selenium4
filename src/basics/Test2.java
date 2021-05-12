package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {
	public static void launchBrowser(WebDriver driver) {
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}
	
	
	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			Test2.launchBrowser(driver);
			WebDriver driver1=new FirefoxDriver();
			Test2.launchBrowser(driver1);
		

		


	}

}
