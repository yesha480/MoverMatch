package framework.TEST;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.po.TestNGBase;

public class TestNGTest2 extends TestNGBase{

	@Test (groups= {"SmokeTest","sanitiTest"},priority=2, timeOut=300)
	public void name3() {
		
		System.out.println("Test name3");
		
	}
	
	@Test (priority=1)
	@Parameters ({"a","b"})
	public void name4(int a , int b) {
		System.out.println("Test name4");
		int c = a *b;
		System.out.println(c);
		
	}


}
