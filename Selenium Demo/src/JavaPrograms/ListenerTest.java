package JavaPrograms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerTest implements ITestListener {
   

@Override
public void onFinish(ITestContext arg0) {
	System.out.println("onFinish method is called after all Tests are executed.");
	
}

@Override
public void onStart(ITestContext Result) {
	System.out.println(" OnStart method is called when any Test starts."+Result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailure(ITestResult Result) {
	  System.out.println("The name of the testcase failed is :"+Result.getName());		
}

@Override
public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestSuccess(ITestResult Result) {
	System.out.println("The name of the testcase passed is :"+Result.getName());		
	
}
}
