package test;


class Animal {
    public static void foo() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
}

public class methodHiding {
	public static void main(String args[])
	{
		Animal.foo(); // prints Animal
		Cat.foo(); // prints Cat
	}
}
