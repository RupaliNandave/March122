package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1_dropdownlist_moveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.flipkart.com");
	       
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       
	       Thread.sleep(2000);
	       WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
	       Actions act=new Actions(driver);
	       
	       act.moveToElement(login).perform();
	       Thread.sleep(2000);
	       driver.quit();
	}

}
