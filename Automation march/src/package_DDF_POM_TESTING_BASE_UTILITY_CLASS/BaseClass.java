package package_DDF_POM_TESTING_BASE_UTILITY_CLASS;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	  
	 static WebDriver driver;
    public static void browserOpen() throws IOException {
    	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       driver.get(UtilityClass.getPropertyFileData("url"));
}
}