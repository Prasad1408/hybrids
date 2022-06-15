package KeyDrivenFramework;

import java.io.IOException;
import java.util.Base64;

public class ActiTimeInvalidLogin extends BestTest {
public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new baseTest();
		bt.openBrowser();
		Thread.sleep(3000);
		
		Flib flib = new Flib();ne
		int rc = flib.getRowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 0);
			String password = flib.readExcelData(EXCEL_PATH,"invalidcreds", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
		
		
		bt.closeBrowser();
} }
