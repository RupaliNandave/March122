package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exp="realme 8 pro";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.google.com");
	       Thread.sleep(4000);
	       
	       driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("realme");
	       Thread.sleep(4000);
	       List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	       
	       for(WebElement option:alloptions) {
	    	   
	    	   String act = option.getText();
	    	   
	    	   if(act.equals(exp)) {
	    		   option.click();
	    		   break;
	    	   }
	       }
           Thread.sleep(2000);
                driver.quit();
	}

}
