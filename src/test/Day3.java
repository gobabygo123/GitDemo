package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	/*@Parameters({"URL"})
	@Test
	public void WebLoginCarLoan(String urlname)
	{
		// selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	}*/
	
	@Test(groups= {"Smoke"})
	public void MobilelogincarLoan()
	{
		//appium
      System.out.println("Mobile");
	}
	@BeforeSuite
	public void bfrSuite()
	{
		System.out.println("Before suite execution");
	}
	
	@AfterSuite
	public void aftrSuite()
	{
		System.out.println("i am the last");
	}
	
	@BeforeMethod                     //  ("i will execute before every test case")
	public void bfrMethod()
	{
		System.out.println("i will execute before every test case");
	}
	@AfterMethod                     //  ("i will execute before every test case")
	public void afrMethod()
	{
		System.out.println("i will execute after every test case");
	}
	
	
	
	
	@Test
	public void MobilesignincarLoan()
	{
		//appium
      System.out.println("Mobile signin");
	}
	@Test(dataProvider="getData")
	public void MobilelsignoutcarLoan(String username,String password)
	{
		//appium
      System.out.println("Mobile signout");
      System.out.println(username);
      System.out.println(password);
	}
    
	@Test
	public void LoginApiCarloan()
	{
		//Rest Api automation
		System.out.println("ApiLogincar");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination - username password -good credit history
		//2nd username password -no credit history
		//3rd fradlentcredit history
		Object[][] data = new Object[3][2];
		//1st set 
		data[0][0] = "firstusername";
		data[0][1]= "firstpassword";
		//2nd set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		//3rd test
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;
		
	}
	
	
	
	
	
	
}

