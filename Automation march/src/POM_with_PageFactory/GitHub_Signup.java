package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHub_Signup {
	
	@FindBy(xpath=("(//a[contains(text(),'Sign up ')] )[2]")) private WebElement SignupBtn;
 
	public GitHub_Signup(WebDriver driver) {
	 PageFactory.initElements(driver,this);
 }
 
 public void clickGitHubSignupBtn() {
	 SignupBtn.click();
 }
}
