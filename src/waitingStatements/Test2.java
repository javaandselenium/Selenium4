package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://twitter.com/");
	driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//div[@dir='auto'])[4]")).click();
	driver.findElement(By.xpath("//input[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu']")).sendKeys("ghhghsgh");
	driver.findElement(By.name("session[password]")).sendKeys("ghhsfh");
	driver.findElement(By.xpath("(//div[contains(@class,'css-901oao r-1awozwy r')])[3]")).click();

	}

}
