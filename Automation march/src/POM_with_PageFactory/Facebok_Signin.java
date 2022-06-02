package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebok_Signin {
	
	@FindBy(xpath="//input[@name='email']") private WebElement UN;
	@FindBy(xpath="//input[@name='pass']") private WebElement PWD;
	
	@FindBy(xpath="//button[@name='login']") private WebElement LoginBtn;
	
	public Facebok_Signin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setFaceBookLoginUsername() {
		UN.sendKeys("rupabadgujar123@gmail.com");
	}
     public void setFacebookLoginPassword() {
    	 PWD.sendKeys("vanitabai");
     }
     public void clickFacebookLoginbtn() {
    	 LoginBtn.click();
     }
}
