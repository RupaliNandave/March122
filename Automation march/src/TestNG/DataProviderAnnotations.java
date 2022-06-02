package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotations {
	
	@DataProvider(name="data-provider")
	public Object[][] 
			dataProvidermethod(){
			
	return new Object[][]{{"Automation Testing"},{"Manual Testing"},{"Database Testing"}};

}
@Test(dataProvider="data-provider")
public void display(String value) {
	System.out.println("Value:"+value);
}}
 //output =Value:Automation Testing
//Value:Manual Testing
//Value:Database Testing