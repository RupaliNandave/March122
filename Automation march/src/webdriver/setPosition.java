package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//setsize of window
		driver.navigate().to("https://www.facebook.com/");
		Dimension d=new Dimension(400,200);//width=400,height=200
		driver.manage().window().setSize(d);
		
		Point p =new Point(400,500);
		driver.manage().window().setPosition(p);
		
		
		
		
		
		
	

	}

}
