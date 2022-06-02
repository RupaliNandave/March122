import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingofMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       Thread.sleep(4000);
	       
	       List<WebElement> allinks = driver.findElements(By.xpath("//a"));
	       System.out.println(allinks.size());//47
	       
	       for(WebElement alllink:allinks) {
	    	   System.out.println(alllink.getText());//all links are printed 
	       }
            Thread.sleep(2000);
            driver.quit();
	}

}
