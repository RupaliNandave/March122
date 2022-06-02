package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyflipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");//open application
	       //highlight searchbar
	       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	       //passing data on searchbar
	       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile phones");
	       
	       //click on search icon
	       driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	       
	}

}
