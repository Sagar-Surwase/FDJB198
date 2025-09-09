package Type_Casting_in_inheritance;

public class Test 
{
	public static void main(String[] args)
	{
		A a = new A();
		
		int x = a.m1();
		
		
		// int y = a.m2();						//Not possible because int is child of Object class...
												//we can not store parent class any return value into child class without type casting...
		int y = (int)a.m2();
		
		
		
		String s1 = a.m3();
		
		// String s2 = a.m4();					//Not possible because String is child of Object class...
												//we can not store parent class any return value into child class without type casting...
		String s2 = (String)a.m4();
		
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(s1);
		System.out.println(s2);
	}

}
