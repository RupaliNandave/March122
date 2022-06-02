package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrl {

	public static void main(String[] args) {
		String expUrl="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       
	       //6.maximize()
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.amazon.in/");
	       
	       //5.getCurrentUrl()-used to get url of current web page
	       String actUrl=driver.getCurrentUrl();
	       
	       if(expUrl.equals(actUrl)){
	    	   System.out.println("Pass");
	       }else {
	    	   System.out.println("fail");
		}
         //7.minimize()
	       driver.manage().window().minimize();
	       driver.quit();
	}

}
