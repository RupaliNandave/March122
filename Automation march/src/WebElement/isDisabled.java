package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	       Thread.sleep(2000);
	       
	     // boolean result =driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	     //System.out.println(result);//true
	       
	       //boolean result =driver.findElement(By.xpath("//img[@class='aaaafb_logo _8ilh img']")).isDisplayed();
	      // System.out.println(result);//true
	       
	       boolean result;
		try {
	    	  WebElement logo=driver.findElement(By.xpath("//img[@class='aaaafb_logo _8ilh img']"));
	    	  result=logo.isDisplayed();
	       }
	       catch(NoSuchElementException e) {
	    	   result=false;
	       }
	       
		
	//System.out.println(result);

	}

}
