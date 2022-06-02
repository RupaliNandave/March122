package CustomizedListBox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4_doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	       Thread.sleep(2000);
	        WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	         Actions act=new Actions(driver);
	         act.doubleClick(doubleclick).perform();
	          //alert popup
	         
	         Alert alt=driver.switchTo().alert();
	         
	         //1.getText
	         System.out.println(alt.getText());//You double clicked me.. Thank You..
	         
	         alt.accept();//2.accept()-used to click on ok button
	         
	         //alt.dismiss();//3.dismiss()-used click on cancel button
	         
	         Thread.sleep(2000);
	         
	         driver.quit();
	}

}
