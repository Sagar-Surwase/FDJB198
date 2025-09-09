package InheritanceExample;

public class B extends A
{
	
	public void m4()
	{
		System.out.println("m4--A");
		
		m1();
		m2();
		
		System.out.println(a);
		System.out.println(b);
	}

}
