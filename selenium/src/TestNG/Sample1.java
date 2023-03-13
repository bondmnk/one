package TestNG;

import org.testng.annotations.Test;

public class Sample1 {

	 @Test
	 public void Demoo() {
		System.out.println(" HElloo");
	  }
	 @Test(groups = "smoke")
	 public void demoo1() {
		 System.out.println(" HElloo1");
	 }



	@Test(groups = "smoke")
	 public void demoo2() {
		 System.out.println(" HElloo2");
	 }
	 @Test
	 public void demoo3() {
		 System.out.println(" HElloo3");
	 }

}
