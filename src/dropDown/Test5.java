package dropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(6000);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

WebElement ele = driver.findElement(By.id("month"));
Select s=new Select(ele);
List<WebElement> option = s.getOptions();
System.out.println(option.size());
ArrayList a=new ArrayList<>();

for(WebElement text:option) {
	String t = text.getText();
	System.out.println(t);
	a.add(t);
}

Collections.sort(a);

for(Object l:a) {
	System.out.println(l);
}
driver.close();
	}

}
