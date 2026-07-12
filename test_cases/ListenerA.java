package test_cases;

import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerA implements ITestListener{
	
	@Override
	public boolean isEnabled() {
		return ITestListener.super.isEnabled();
	}

	@Override
	public void onTestStart(ITestResult result)  {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("CONGRATS!"+result.getMethod().getMethodName());
	}

}
