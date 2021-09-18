package Pack_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void Test01() {
	  
	  System.out.println("Test_01");
  }
  
	  @Test
	  public void Test02() {
		  
		  System.out.println("Test_02");
	  }
	
		  @Test
		  public void Test03() {
			  
			  System.out.println("Test_03");
		  }
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test_01");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Atfer calss");
  }

}
