package package_DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_HomePage {
	

	@FindBy(xpath="(//div[@class='j83agx80 l9j0dhe7 gl4o1x5y lt9micmv'])[1]") private WebElement button;
	
	
	public Facebook_HomePage (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	public String verifyFacebookHomePagePRofileName() {
		String actResult=button.getText();
		return actResult;
	}
	public void clickimg() {
		button.click();
	}

	}