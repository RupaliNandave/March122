package ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintoptionsInList_Alphabeticalorder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	      
	       driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	       Thread.sleep(2000);
	        WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	        
	        Select s=new Select(month);
	         
	        List<WebElement>options=s.getOptions();
	        
	        TreeSet<String>ts=new TreeSet<String>();
	        
	        for(WebElement option:options) {
	        	String text=option.getText();
	        	ts.add(text);
	        }
	        
	        for(String s1:ts) {
	        	System.out.println(s1);
	        }
	        
	        driver.quit();
	}

}
