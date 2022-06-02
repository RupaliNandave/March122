package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	       Thread.sleep(2000);

	       WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));//true
	      //female.click();
	       Thread.sleep(1000);
	       
	     boolean result = female.isSelected();
	     System.out.println(result);//false
	     driver.quit();
	}

}
