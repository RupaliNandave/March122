package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.get("https://github.com");
	       Thread.sleep(4000);
		GitHub_Signup singup=new GitHub_Signup(driver);
		singup.clickGitHubSignupBtn();
		Thread.sleep(2000);
	}

}
