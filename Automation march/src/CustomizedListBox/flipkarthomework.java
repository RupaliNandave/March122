package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkarthomework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.flipkart.com/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       Actions act= new Actions(driver);
              WebElement button = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
              
              act.moveToElement(button).perform();//mouse over on Electronics
              Thread.sleep(6000);
              
            WebElement Gaming = driver.findElement(By.xpath("//a[@class='_6WOcW9'][3]"));
            act.moveToElement(Gaming).perform();
            Thread.sleep(6000);
            WebElement game = driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][6]"));
            act.moveToElement(game).perform();
            act.click().perform();
            Thread.sleep(6000);
           
            //driver.quit();
            
            
            
          
                
              
}}
