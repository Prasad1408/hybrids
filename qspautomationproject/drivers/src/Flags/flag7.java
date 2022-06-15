package Flags;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag7 {
	
	@Test(groups ="FUNCTIONAL")
	public void ft1()
	{
		Reporter.log("ft1 ", true);
	}
	@Test(groups = "SMOKE")
	public void st1()
	{
		Reporter.log("st1 ", true);
	} 
	@Test(groups ="INTEGRACTION" )
	public void it1()
	{
		Reporter.log("it1 ", true);
	} 
	//------------------------------------------------------------------------
	@Test(groups ="FUNCTIONAL")
	public void ft2()
	{
		Reporter.log("ft2 ", true);
	}
	@Test(groups = "SMOKE")
	public void st2()
	{
		Reporter.log("st2 ", true);
	} 
	@Test(groups ="INTEGRACTION" )
	public void it2()
	{
		Reporter.log("it2 ", true);
	}
	//--------------------------------------------------------------------
	@Test(groups ="FUNCTIONAL")
	public void ft3()
	{
		Reporter.log("ft3", true);
	}
	@Test(groups = "SMOKE")
	public void st3()
	{
		Reporter.log("st3", true);
	} 
	@Test(groups ="INTEGRACTION" )
	public void it3()
	{
		Reporter.log("it3", true);
	}
}
	
