package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Example1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       
	       Thread.sleep(2000);
	       
	       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       System.out.println(src);//C:\Users\SWAPNIL\AppData\Local\Temp\screenshot10005327305720114485.png
	       
	       File dest= new File("D:\\eclipse\\Sceenshot\\facebook.png");
	       FileHandler.copy(src, dest);
	       
	       
	       Thread.sleep(2000);
	       
	       driver.quit();
	}

}
