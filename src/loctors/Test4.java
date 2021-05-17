package loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		//verification
		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:Home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:Home page is not displayed");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

}
