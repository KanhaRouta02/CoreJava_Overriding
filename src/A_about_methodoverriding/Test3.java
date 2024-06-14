package A_about_methodoverriding;

class A
{
//   public final void m1()
//   {
//	   System.out.println("A");
//   }
	
//	 private void m2()
//	 {
//		 System.out.println("A");
//	 }
	
	
}
class B extends A{
	
//	// Cannot override the final method from A
//	public void m1() // error
//	{
//		System.out.println("B");
//	}
	
	// The method m2() from the type B is never used locally
	private void m2()
	 {
		 System.out.println("A");
	 }
}
public class Test3 {

	public static void main(String[] args) {
		A a = new A();
	    // The method m2() from the type B is never used locally
		// a.m2();// error
	}
}
