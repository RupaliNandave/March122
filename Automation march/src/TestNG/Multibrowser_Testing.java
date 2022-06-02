package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser_Testing {
	
	@Parameters("browsername")
	@Test
	public void TC1( String browsername) throws InterruptedException {
	
	WebDriver driver=null;
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
	      
	}else if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\eclipse\\Firefox\\geckodriver.exe");
			  driver=new FirefoxDriver();
		}
   driver.manage().window().maximize();
   
   driver.get("https://www.facebook.com");
   Thread.sleep(4000);
   driver.quit();
   
}}
