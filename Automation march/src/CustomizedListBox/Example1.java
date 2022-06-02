package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	       Thread.sleep(4000);
	         WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	         
	         Actions act=new Actions(driver);//keyboard can interact with browser with the help of Actions class
	         
	         act.click(month).perform();//may
	         Thread.sleep(2000);
	         
	         act.sendKeys(Keys.ARROW_DOWN).perform();
	         act.sendKeys(Keys.ARROW_DOWN).perform();
	         act.sendKeys(Keys.ARROW_DOWN).perform();
	         act.sendKeys(Keys.ARROW_DOWN).perform();
	         
	         act.sendKeys(Keys.ENTER).perform();
	}

}
