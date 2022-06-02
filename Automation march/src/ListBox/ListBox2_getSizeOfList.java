package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBox2_getSizeOfList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");//open application
	      
	       driver.findElement(By.xpath("//a[contains(text(),'Create ')]")).click();
	       Thread.sleep(2000);
	        WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	        
	        Select s=new Select(month);
	         
	        List<WebElement>options=s.getOptions();
			int size= options.size();
			System.out.println("size of month listbox:"+size);//size of month listbox:12
			
			//print all options in list box using for each loop
			
			for(WebElement option:options) {
				System.out.println(option.getText());
			}
			
			//print all options in list box using for loop
			for(int i=0; i<=size-1;i++) {
				System.out.println(options.get(i).getText());
			}
			
			driver.quit();
	}

}
