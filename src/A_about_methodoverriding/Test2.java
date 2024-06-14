package A_about_methodoverriding;

// Static method can not override , if we perform override means it is the concept 
// of method hiding.

class Parent1 {
	static void meth() {

		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	
	static void meth() {

		System.out.println("Child");
	}
}

public class Test2 {
public static void main(String[] args) {
	Parent1 p = new Child1();
	p.meth(); // Parent
              // Because based on type it will call
}
}
