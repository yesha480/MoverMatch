package framework.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	 static ExtentReports extent;

	    public synchronized static ExtentReports getReporter() {
	        if (extent == null) {
	            //Set HTML reporting file location
	        	/*String path =  System.getProperty(("user.dir") + "/ExtentReports");
	        	System.out.println("path  " + path);*/
	           //String workingDir = "/Users/yesha.shah/Documents/selenium/eclipes programs/TestNG_MoverMatch/TestNG_Movermatch/ExtentReports";
	            DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy-HH_mm_ss");
	           
	            if (System.getProperty("os.name").toLowerCase().contains("win")) {
	            
	                extent = new ExtentReports(System.getProperty("user.dir") +"/ExtentReports/ExtentReportResults_"+dateFormat.format(System.currentTimeMillis())+".html", false);
	            }
	            else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
	            
	                extent = new ExtentReports(System.getProperty("user.dir") +"/ExtentReports/ExtentReportResults_"+dateFormat.format(System.currentTimeMillis())+".html", false);
	            }
	        }
	        return extent;
	    }

}
