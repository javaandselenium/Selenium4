package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.);
		
		WebDriverWait w=new WebDriverWait(driver, timeOutInSeconds);
		
		WebElement ele = driver.findElement(By.id("username"));
		w.until(ExpectedConditions.visibilityOf("address of the webelement ")).sendKeys("ghgj");
		
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
		w.until(ExpectedConditions.elementToBeClickable("address of the webelement ")).click();
		
		String title = driver.getTitle();
		w.until(ExpectedConditions.titleIs("title of the page"));
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
		
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

	}

	}

}
