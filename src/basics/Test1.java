package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//To enter the url and wait untill page is loaded
		driver.get("https://www.flipkart.com/");
		//To fetch the title from the application
		System.out.println(driver.getTitle());
		//To fetch the url from the application
		System.out.println(driver.getCurrentUrl());
		//To close the application
		driver.close();

	}

}
