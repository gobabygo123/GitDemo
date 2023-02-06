package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeClass
	public void befoclass()
	{
		System.out.println("before executing my method in the class");
	}
	@AfterTest
	public void lastexecution()
	{
		System.out.println("last execution");
	
	}
	@Test
	public void Demo()
	{
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
      System.out.println("bye");
	}

}
