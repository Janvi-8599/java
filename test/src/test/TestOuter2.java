package test;

public class TestOuter2 {
	  static int data=30;  
	  static class Inner{  
	   static void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
	  TestOuter2.Inner.msg();//no need to create the instance of static nested class  
	  } 
}

/*

here nested static class have static method named msg.. and as we know for calling static method or variable we don't 
need to create object of it...

TestOuter2.Inner.msg();


and if we have non static method inside static class then we need to create object of inner class and then call that method.

nested static class can't access non static variables or methods of it's outer class but we can declare and define non static method inside it

*/