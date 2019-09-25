package Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_test{
  @Test
  public void testMethod1() {
	  Assert.assertTrue(20>18);
  }
  @Test
  public void testMethod2() {
	  Assert.assertEquals("Hello", "hi");
  }
  @Test
  public void testMethod3() {
	  Assert.assertEquals("hi", "hi");
  }
}
