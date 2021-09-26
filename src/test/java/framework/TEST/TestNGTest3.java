package framework.TEST;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.framework.base;
import com.po.VendorLoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import framework.utils.ExtentTestManager;
import jdk.internal.org.jline.utils.Log;

public class TestNGTest3 extends base {
	
	@Test
	public void Testcase3() throws InterruptedException {
	
		ExtentTestManager.startTest("Testcase3","testcase3 verification");
		
		
		String jok = "test3";
		AssertJUnit.assertEquals(jok, "te");
		/*if (jok.equals("te")) {

			ExtentTestManager.getTest().log(LogStatus.PASS, "Test case 3 pass");
			
			System.out.println("pass");
		}
		else {
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Test case 3 fail");
		
			System.out.println("fail");
	
		}*/
		ExtentTestManager.endTest();
	}


}
