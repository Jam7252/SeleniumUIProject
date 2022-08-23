package extenetreportListener;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class retryAnalyze {
	
	@Test(retryAnalyzer = extenetreportListener.ExtentReportListener.class)
	public void Test1()
	{
		int a=6;
		int b =9;
		int c;
		c=a+b;
		
		Assert.assertEquals(14, c);
		
	}
	
	@Test
	public void div()
	{
		int j=10;
		int k=20;
		int divv;
		
		divv= k/j;
		Assert.assertEquals(5,divv);
	}

}
