package CustomizedListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2_dropdownlist_ContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.flipkart.com");
	       
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	        WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
	        
	        Actions act=new Actions(driver);
	        act.moveToElement(more).perform();
	        act.contextClick(more).perform();//to perform right click operation
	        Thread.sleep(2000);
	        //Click() used to perform left click
	        
	        
	        act.click(more).perform();//to perform left click operation
	        Thread.sleep(2000);
	        driver.quit();
	}

}
