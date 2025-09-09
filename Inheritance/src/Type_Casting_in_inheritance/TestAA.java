package Type_Casting_in_inheritance;

public class TestAA
{
	
	public AA m1()
	{
		BB bb = new BB();			//here we create object of BB class which is child of class AA
		
		bb.x = 100;
		
		return bb;					//we can return child class object when return type as parent class
	}
	
	
	public static void main(String[] args)
	{
		TestAA t = new TestAA();
									//for type casting consider example as big chocolate jar(parent) & small chocolate jar(child)....
		BB b = (BB)t.m1();			//here type casting is mandatory because we can not store parent class return value in child class object
									// in above return type is parent class but we return child object....
		System.out.println(b.x);
	}
}
