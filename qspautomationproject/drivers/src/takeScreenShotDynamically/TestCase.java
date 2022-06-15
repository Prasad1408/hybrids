package takeScreenShotDynamically;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestCase extends BaseTest  {
	
	@BeforeMethod
	public void setUp()
	{  
		initialization();
	}
	@Test
	public void  validLogin()
	{
		
	}
	