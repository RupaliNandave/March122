package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       
	       //xpath by attribute   syntax ://tagname[@Property name='Property value']
	       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa@pune.com");
	       
	       //xpath by text   //tagname[text()='text value']
	       driver.findElement(By.xpath("//button[text()='Log In']")).click();
	      // Thread.sleep(2000);
	      // driver.quit();
	}


}
