package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://skpatro.github.io/demo/links/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	       
	       Set<String>ids =driver.getWindowHandles();
		     
		     ArrayList<String>al=new ArrayList<String>(ids);
		     driver.switchTo().window(al.get(1));//child page
		     Thread.sleep(2000);
		     driver.manage().window().maximize();
		     
		     driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		     Thread.sleep(4000);
		     
		     driver.switchTo().window(al.get(0));
		     
		     WebElement ele = driver.findElement(By.xpath("//input[@name='NewTab']"));
		     ele.click();
		     Thread.sleep(4000);
		      
		     
		    
		     Thread.sleep(2000);
		     driver.quit();
		     
		   
		     
	       
	       

	}

}
