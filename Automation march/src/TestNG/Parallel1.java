package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
	 public void TC1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com");
      
      Thread.sleep(2000);


}
}