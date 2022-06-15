package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	//declaration
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks]") private WebElement createNewTask;
	@FindBy(linkText="Settings") private WebElement settings;
	
	
	//initialization
	public HomePage() {
		
	}
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}

	public void clickLogout1() {
		// TODO Auto-generated method stub
		
	}
	//operational method
	public void clickLogout()
	{
		logoutLink.click();
	}
	
	public void clickSaveLeaveTimeBtn()
	{
		WebElement saveLeaveTimeBtn = null;
		saveLeaveTimeBtn.click();
	}
	
}
