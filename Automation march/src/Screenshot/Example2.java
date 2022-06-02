package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       
	       Thread.sleep(2000);
	       
	       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        String random= RandomString.make(4);
	        
	        File dest= new File("D:\\eclipse\\Sceenshot\\facebook"+random+".png");
	        
	        FileHandler.copy(src, dest);
		       
		       
		       Thread.sleep(2000);
		       
		       driver.quit();
	        
	        
	        
	       
	}

}
