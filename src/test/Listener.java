package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("I FAILED EXECUTED LISTENER PASS CODE");
	}

}
