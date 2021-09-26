package framework.TEST;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.po.TestNGBase;

public class TestNGTest extends TestNGBase {
	
	@Test (groups= {"SmokeTest"}, enabled = true, priority=2)
	@Parameters ({"a", "b"})
	public void name1(int a , int b) {
		
		System.out.println("Test name1");
		int c = a+b;
		System.out.println(c);
		
	}
	
	@Test (groups= {"sanitiTest"}, dependsOnMethods = {"name1"}, priority=3)
	public void name2() {
		System.out.println("Test name2");
	}
	
	
	@Test (priority=1)
	public void name5() {
		System.out.println("Test name5");
	}


}
