package POM_with_PageFactory;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebook_Test {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com");
	       Thread.sleep(4000);
	       
		Facebok_Signin signin=new Facebok_Signin(driver);
		signin.setFaceBookLoginUsername();
		signin.setFacebookLoginPassword();
		Thread.sleep(4000);
		signin.clickFacebookLoginbtn();
		
		Thread.sleep(4000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 System.out.println(src);
		 
		 File dest = new File("E:\\eclipse\\Sceenshot\\facebook.png");
		 FileHandler.copy(src, dest);
		 
		
		//driver.quit();
		

	}

		
	}

