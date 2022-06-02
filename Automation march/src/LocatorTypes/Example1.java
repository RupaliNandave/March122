package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("file:///C:/Users/SWAPNIL/Desktop/web.html");
	       
	       //1.tagname
	       
	       driver.findElement(By.tagName("input")).sendKeys("qa@pune.com");
	       Thread.sleep(2000);
	       //2.id
	       
	       driver.findElement(By.id("123")).sendKeys("123456");
	       Thread.sleep(2000);
	       //classname
	       driver.findElement(By.className("abcd")).sendKeys("quantum@pune.com");
	       Thread.sleep(2000);
	       //name
	       driver.findElement(By.name("xyz")).sendKeys("12345566");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.linkText("Link1")).click();
	       driver.findElement(By.partialLinkText("Li")).click();
	       driver.quit();


	}

}
