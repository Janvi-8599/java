package test;

public class ObjInPrivate {
	private int i = 5;
	private int j = 7;
	private int sum(int a,int b)
	{
		return (a+b);
	}
	public ObjInPrivate createObj()
	{
		ObjInPrivate o1 = new ObjInPrivate();
		return o1;
	}
	
	public static void main(String args[])
	{
		ObjInPrivate o = new ObjInPrivate();
		int k = o.sum(o.i, o.j);
		System.out.print("sum is...."+k);		
		ObjInPrivate a = o.createObj();
		System.out.print("sum is...."+a.i);
	}
	
}

