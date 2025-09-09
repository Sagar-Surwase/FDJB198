package Parent_Refrence_Child_Object_Example;

public class TestAA 
{

	public static void main(String[] args)
	{
		BB bb = new CC();
		
		bb.m1();					//m1--A
		bb.m2();					//m2--c
		bb.m3();					//m3--B
		bb.m4();					//m4--C
		bb.m5();					//m5--B
		// bb.m6();
		
		
		System.out.println(bb.a);		//30
		System.out.println(bb.b);		//20
		System.out.println(bb.c);		//40
		// System.out.println(bb.d);
		
	}

}
