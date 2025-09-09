package ReturnType_as_Class_object_in_inheritance;

public class Test
{
	
	public A m1()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		return a;				//Here, we can return same class refrence or their child class refrence 
		// return b;			// following both are valid because they are child of class A
		// return c;
	}
	
	
	public B m2()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		return b;				//Here, we can return same class refrence or their child class refrence 
		// return c;			// <== return C class refrence is valid because C is child of class B
		
		// return a;			//Here, this is not possible because of A class is Parent of B class  
	}								//i.e we can not return parent class refrence.....
	
	
	public C m3()
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		return c; 				//Here, we can return same class refrence or their child class refrence Class c has no child..
		
		// return a;			//Here, this is not possible because of A class is Parent of B class  
		// return b;			//B class is Parent of C class       i.e we can not return parent class refrence....
										
	}
	
	
	public static void main(String[] args) 
	{
		
		Test t = new Test();
		
		A a1 = t.m1();
		
		// C c =  t.m1();			//here type casting is mandatory because we can not store parent class return value in child class object
		
		// A a2 = t.m2();			//we can store child class object, return value in parent class as well because of implicit type casting...
		
		B b = t.m2();
		
		// A a3 = t.m2();			//we can store child class object return value in parent class as well because of implicit type casting...
		
		C c =t.m3();
		
	}

}
