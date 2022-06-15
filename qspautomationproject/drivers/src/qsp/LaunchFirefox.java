package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {
	
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\C DRIVE PROFILE DATA\\Desktop\\WCSM7\\geckodriver.exe");
	 FirefoxDriver driver = new  FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https:/www.facebook.com");
	 Thread.sleep(10000);
	 driver.close();
		

	}
}
