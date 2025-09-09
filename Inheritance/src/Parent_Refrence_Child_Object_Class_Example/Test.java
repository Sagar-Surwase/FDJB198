package Parent_Refrence_Child_Object_Class_Example;

public class Test 
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		A a1 = new B();
		
		a1.m1();											//m1--A
		a1.m2();											//m2--B
		// a1.m3();		// compilation error
		a1.m4();											//m4--B
		
		
		System.out.println(a1.a);							//20
		System.out.println(a1.b);							//30
		// System.out.println(a1.c);	// compilation error
		System.out.println(a1.d);							//50
		
		
		System.out.println("*********************************************************************");
		
		
		B b1 = new C();
		b1.m1();											//m1--A
		b1.m2();											//m2--B
		b1.m3();											//m3--B
		b1.m4();											//m4--C
		// b1.m5();		  	 	// compilation error
		
		
		System.out.println(b1.a);							//20
		System.out.println(b1.b);							//10
		System.out.println(b1.c);							//50
		System.out.println(b1.d);							//50
	
		
		
		System.out.println("*********************************************************************");
		
		
		
		A a2 = new C();
		
		a2.m1();											//m1--A
		a2.m2();											//m2--B
		// a2.m3();						// compilation error
		a2.m4();											//m4--C
		// a2.m5();						// compilation error
		
		System.out.println(a2.a);							//20
		System.out.println(a2.b);							//30
		// System.out.println(a2.c);	 // compilation error
		System.out.println(a2.d);							//50		
		
	}
}
