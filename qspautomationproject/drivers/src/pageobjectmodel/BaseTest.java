package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant1 {
	static WebDriver driver;
	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String url = flib.readPropertyFile("./data/config.properties", "url");
		String browserValue = flib.readPropertyFile("./data/config.properties", "browser");

		if(browserValue.equalsIgnoreCase(browserValue))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}

		else if(browserValue.equalsIgnoreCase(browserValue))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	

		}

		else
		{
			System.out.println("enter the correct choice");
		}



	}



	public void tearDown()
	{
		driver.quit();
	}

}
