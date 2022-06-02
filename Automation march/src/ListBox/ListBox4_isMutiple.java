package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_isMutiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	      
	       driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	       Thread.sleep(4000);
	       
	        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	        
	        Select s=new Select(day);
	        boolean result=s.isMultiple();
	        
	        if(result==true) {
	        	System.out.println("list box is multi-selectable");
	        }
	        else {
	        	System.out.println("list box is single-selectable");
	        }
	        driver.quit();
	}

}
