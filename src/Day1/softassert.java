package Day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
  @Test
  public void testmethod() {
	  SoftAssert sa=new SoftAssert();
	  System.out.println("Checking first validation");
	  sa.assertEquals(10,11);
	  System.out.println("checking second validation");
	  sa.assertEquals("Hello", "Welcome");
	  sa.assertAll();
  }
}
