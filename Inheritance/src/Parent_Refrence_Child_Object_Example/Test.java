package Parent_Refrence_Child_Object_Example;

public class Test
{

	public static void main(String[] args) 
	{
		A a = new B();
		
		a.m1();				//B class m1() method called according to Method running rule
		a.m2();
		// a.m3(); 		//compliation error according to parent refrence = child object compilation rule...

		System.out.println(a.a);		//A class variable called according to Variable running rule
		System.out.println(a.b);
		// System.out.println(a.c);		//compliation error according to parent refrence = child object compilation rule...
	}

}
