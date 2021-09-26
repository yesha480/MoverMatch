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
import static org.testng.Assert.assertTrue;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.framework.base;
import com.po.VendorLoginPage;
import com.relevantcodes.extentreports.LogStatus;

import framework.utils.ExtentTestManager;
import jdk.internal.org.jline.utils.Log;



public class VendorLogin extends base {
	
Logger log = LogManager.getLogger(VendorLogin.class.getName());
	
	@Test
	public void testcase1() throws InterruptedException {
		
		log.info("Test case1 testting stated");
		ExtentTestManager.startTest("testcase1", "profile verification");

		VendorLoginPage vendorLoginPage = new VendorLoginPage(driver);

		vendorLoginPage.emailID.sendKeys("yesha_vendor@mailinator.com");
		Thread.sleep(2000);
		vendorLoginPage.password.sendKeys("Test@123");

		Thread.sleep(2000);
		vendorLoginPage.signInButton.click();
		Thread.sleep(5000);
		String UserProfileName = vendorLoginPage.profileName.getText();
		System.out.print("User profile name : "+UserProfileName); 
		String expectedUserProfileName = "Yesha Vendor";
		AssertJUnit.assertEquals(UserProfileName, expectedUserProfileName);
		/*if (UserProfileName.equals(expectedUserProfileName)) {
			System.out.println("Profile is verify ");
		}else {
			System.out.println("Profile is not verify ");
		}*/
		log.info("Test case1 testting end");
		ExtentTestManager.endTest();

	}
	
	@Test
	public void testcase2() {
		
		ExtentTestManager.startTest("testcase2","test case 2 verification");
		String myName = "test2";
		
		AssertJUnit.assertEquals(myName, "test2");
		/*if (myName.equals("test2")) {
			System.out.println("Test case 2 is pass");
			
		}
		else
		{
			System.out.println("Test case 2 is fail");
			
		}*/
		ExtentTestManager.endTest();
		
	}


}
