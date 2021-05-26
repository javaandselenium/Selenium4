package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		//Typcasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//to access to the method photo is stored in RAM location
		File src = ts.getScreenshotAs(OutputType.FILE);
		//specify the required location
		File dest=new File("./photo/amazon.png");
		//copy the photo from ram to required location
		FileUtils.copyFile(src, dest);
		driver.close();
	
	}

}
