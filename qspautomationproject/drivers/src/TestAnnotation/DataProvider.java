package TestAnnotation;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DataProvider {
	WebDriver driver;
 @BeforeMethod
public void setUp()
{ 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://desktop-42o9efa/login.do");
}
    @DataProvider(name="testActiTimeData")
    public Object[][]dataprovider()
    {
	  
}8

}
