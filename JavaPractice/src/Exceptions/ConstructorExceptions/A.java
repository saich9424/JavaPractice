package Exceptions.ConstructorExceptions;


public class A extends B {
	static char classToThrow;
	C mC = new C(classToThrow);
	D mD = new D(classToThrow);
	int a=6;
	
	void get()
	{
		System.out.println("Sample");
	}
	String stateA = "NOT initialized";
	A() throws Exception {
		super(classToThrow);
		System.out.println(a);
		get();
		System.out.println("in Constructor A() with class to throw: " + classToThrow); 
		if (classToThrow == 'A') 
			throw new Exception();
		stateA = "initialized";
	}
}
