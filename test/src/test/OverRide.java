package test;

class Simple{
	int i =10;
//	protected void show()
	void show()
	{
		System.out.println("Simple.show()");
	}
	
}

public class OverRide extends Simple{
	void show()
	{
		System.out.println("hiiiii");
	}
	
	
	public static void main(String args[])
	{
		OverRide obj = new OverRide();
		obj.show();
	}
}


/*    It gives us compile time error because we can no reduce visibility while overriding any method.
 */