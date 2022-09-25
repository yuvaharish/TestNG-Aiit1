package retrypack;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int filedcount=1;
	int limit=4;
	
	@Override
	public boolean retry(ITestResult result) {
		if (filedcount<limit) {
			filedcount++;
			return true;
		}
		return false;
	}

}
