package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Collection.Arraylist;


public class childbrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://skpatro.github.io/demo/links/");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	       
	     String idofmainpage = driver.getWindowHandle();
	     System.out.println(idofmainpage);//3CDF7408C1769048A964ECC31BB808B3
	     
	     Set<String>ids =driver.getWindowHandles();
	     
	     ArrayList<String>al=new ArrayList<String>(ids);
	     System.out.println(al.get(0));//id of main page
	     System.out.println(al.get(1));//id of child page// 7A9E502CFB8E4C8198F65C3D78C9D88D
	     
	     Thread.sleep(2000);
	     driver.quit();
	     
	       

	}

}
