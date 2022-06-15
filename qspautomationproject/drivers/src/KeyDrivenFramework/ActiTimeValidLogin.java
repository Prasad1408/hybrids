package KeyDrivenFramework;

import java.io.IOException;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BestTest {
	private static final String PROP_PATH = null;

	public static void main(String[] args) throws IOException, InterruptedException {

		//object creation
		BestTest bt = new BestTest();
		Flib flib = new Flib();
		
		//read the data from property file use the generic reusable method
		String username = flib.readPropertyFile("./data/config.properties","username");
		String password = flib.readPropertyFile("./data/config.properties","password");
		//open the browser
		bt.openBrowser1();
		Thread.sleep(3000);
		//perform login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//close the browser
		//bt.closeBrowser1();
		
		
	}
}
