package test;

class Demo {
	int a;
	
	Demo(int k)
	{
		System.out.println("hiii" + k);

	}
	
	Demo(Integer k)
	{
		System.out.println("hellooooo" + k);
		
	}

}

public class TestingDemo {
	public static void main(String args[])
	{
		int a = 5;
		Integer b = 6;
		Demo t = new Demo(a);
		Demo t1 = new Demo(b);
	}
}