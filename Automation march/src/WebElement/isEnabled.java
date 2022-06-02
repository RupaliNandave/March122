package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	       Thread.sleep(2000);
	       
	       
	      boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
	      
	      if (result==true) {
	    	  System.out.println("element is enabled");//element is enabled
	      }
	      else {
	    	  System.out.println("element is disabled");
	      }
driver.quit();
	}
	

}
