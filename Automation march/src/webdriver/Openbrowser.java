package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
           
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//upcasting
		driver.get("https://www.facebook.com");
		//get() - to open specific url
		
		///2.close()
		driver.close();//to close single tab
		
		//3.quit()- to close multiple tabin single browser
		
		driver.quit();
		
		
		
		

	}

}
