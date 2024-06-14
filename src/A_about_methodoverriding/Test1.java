package A_about_methodoverriding;

class Parent {
	int meth(String s, boolean b) {
       // Parent Logic
		return 22;
	}
}

class Child extends Parent {
	@Override
	int meth(String x, boolean y) {
       // Child Log
		return 52;
	}
}

public class Test1 {

	public static void main(String[] args) {
        Child c = new Child();
        int meth = c.meth("kanha", false);
        System.out.println(meth); //52
	}
}
