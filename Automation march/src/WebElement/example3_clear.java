package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	       Thread.sleep(2000);
	      
	        WebElement email = driver.findElement(By.cssSelector("input[autofocus='1']"));
	       email.sendKeys("qa@pune.com");
	       Thread.sleep(4000);
	       
	      // email.clear();
	       driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("abc@123");
	        driver.findElement(By.xpath("//button[@name='login']")).click();
	        Thread.sleep(2000);
	        //driver.quit();
	       
	       
	      

	}

}
