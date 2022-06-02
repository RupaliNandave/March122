package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://demo.guru99.com/test/delete_customer.php");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1");
             driver.findElement(By.xpath("//input[@name='submit']")).click();

      Alert alt=driver.switchTo().alert();
      alt.accept();//ok
      //alt.dismiss();//cancel
      
      Alert alt1=driver.switchTo().alert();
        String text = alt1.getText();
        System.out.println(text);
        alt1.accept();
        
        Thread.sleep(2000);
        driver.quit();
      
      
	}

}
