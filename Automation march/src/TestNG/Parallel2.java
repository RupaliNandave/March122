package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {

	@Test
	public void TC2() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      driver.get("https://www.Flipkart.com");
      
      Thread.sleep(2000);

}}
