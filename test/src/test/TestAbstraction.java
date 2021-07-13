package test;


abstract class Shape{  
//abstract void draw();  
	void draw()
	{
		System.out.println("Shape.draw()");
	}
} 

class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  


class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  


public class TestAbstraction {
	public static void main(String args[]){  
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		}  
}


// here we call method by object of main abstract class so end user doesn't know about shape internally has which value and which method gets called