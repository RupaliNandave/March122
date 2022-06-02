package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class displaytitle {

	public static void main(String[] args) {
		//String title="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.google.com");
	       String title =driver.getTitle();
	       System.out.println("Webpage title is:"+title);
	       String url =driver.getCurrentUrl();
	       System.out.println(url);
	       driver.close();
	       
	}

}
