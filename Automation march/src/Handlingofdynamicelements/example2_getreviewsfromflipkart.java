package Handlingofdynamicelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getreviewsfromflipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.flipkart.com");
	       Thread.sleep(4000);
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      
	       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 9 pro");
	       Thread.sleep(6000);
	       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//click on search
	       Thread.sleep(4000);
	       String reviews = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//span)[6]")).getText();
	       System.out.println(reviews);//1,800 Reviews
	       Thread.sleep(9000);
	       driver.quit();
	}

}
