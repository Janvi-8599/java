package test;

class parent {
	int a;
	parent()
	{
		System.out.println("parent.parent()");
		this.a = 0;
	}
	parent(int a)
	{
		System.out.println("parent.parent() parametrised");
		this.a = a;
	}
}

class child extends parent {
	int j;
	child()
	{
		super(5);
		System.out.println("child.child()");
		this.a = 0;
	}
	child(int a)
	{
		System.out.println("child.child() parametr");
		this.a = a;
	}
}



public class InheritanceDemo {

	public static void main(String[] args) {
		child c = new child(5);
		child c1 = new child();
	}

}
