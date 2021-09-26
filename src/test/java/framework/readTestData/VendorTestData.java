package framework.readTestData;

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


import com.framework.ReadExcel;
import com.framework.base;
import com.po.VendorLoginPage;

import framework.utils.ExtentTestManager;

public class VendorTestData extends base{
	
	ReadExcel readExcel = new ReadExcel();
	
	@Test
	public void testcase10() throws InterruptedException {
		
		
		ExtentTestManager.startTest("testcase10", "profile verification");

		readExcel.readVendorLoginData();
		readExcel.readHomeScreenDate();
		VendorLoginPage vendorLoginPage = new VendorLoginPage(driver);

		vendorLoginPage.emailID.sendKeys(readExcel.userName);
		Thread.sleep(2000);
		vendorLoginPage.password.sendKeys(readExcel.password);

		Thread.sleep(2000);
		vendorLoginPage.signInButton.click();
		Thread.sleep(5000);
		String UserProfileName = vendorLoginPage.profileName.getText();
		System.out.print("User profile name : "+UserProfileName); 
		String expectedUserProfileName = readExcel.profileName;
		AssertJUnit.assertEquals(UserProfileName, expectedUserProfileName);
		/*if (UserProfileName.equals(expectedUserProfileName)) {
			System.out.println("Profile is verify ");
		}else {
			System.out.println("Profile is not verify ");
		}*/
		ExtentTestManager.endTest();

	}

}
