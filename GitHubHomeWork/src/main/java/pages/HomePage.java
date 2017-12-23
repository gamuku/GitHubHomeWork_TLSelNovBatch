package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdmethods.SeMethods;

public class HomePage extends SeMethods{

	public HomePage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="lst-ib")
	private WebElement eleSearchBox;
	public HomePage typeInSearchBox(String query){
		type(eleSearchBox, query);
		return this;
	}
	
	@FindBy(how=How.NAME,using="btnK")
	private WebElement eleGoogleSearchBtn;
	public SearchPage clickGoogleSearch(){
		click(eleGoogleSearchBtn);
		return new SearchPage(driver,test);
	}

}
