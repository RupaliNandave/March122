package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
	
		String expTitle="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.amazon.in/");
       //4.getTitle()- used to get the title of webpage
       
       String actTitle=driver.getTitle();//Amazon.in
       System.out.println(actTitle);
       
       
       if(expTitle.equals(actTitle)) {
    	   System.out.println("Pass");
       }
       else {
    	   System.out.println("Fail");
       }
       driver.quit();
       }
	}


