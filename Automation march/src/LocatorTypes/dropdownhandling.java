package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	       
	       driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	       Thread.sleep(2000);
	       
	       WebElement month= driver.findElement(By.xpath("//select[@class='_9407 _5dba _9hk6 _8esg'][2]"));
		//step1:
	       Select s=new Select(month);
	       s.selectByIndex(5);
	       s.selectByVisibleText("Jan");
	       s.selectByValue("1");
	       
	       

	}

}
