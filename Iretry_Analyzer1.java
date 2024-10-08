package Retrylogic1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_Analyzer1 implements IRetryAnalyzer
{
	int currentcount =0;
	int noofretry =2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if (currentcount<noofretry)
		{
			currentcount++;
			return true; // give retry
		}
		return false; // do not give retry
	}

}
