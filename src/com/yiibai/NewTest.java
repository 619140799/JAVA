package com.yiibai;
import org.testng.asserts.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=0)
  public void f() {
	  
	  RandomEmailGenerator a = new RandomEmailGenerator();
	  String email = a.generate();
	  
	  Assert.assertNotNull(email);
	  Assert.assertEquals(email, "619140799@qq.com");
	  System.out.println("f");
	  
  }
  
  @Test(priority=1)
  public void returnvalue1() {
	  Value1 v1 = new Value1();
	  int va1 = v1.getvalue1(3, 5);
	  
	  Assert.assertEquals(va1, 8);
	  
	  System.out.println("returnvalue1");
  }
}
