package abstractDesignPattern;

public class AbstractDesignPatternDemo {

	public static void main(String[] args) {
		 AbstractFactory shapeFactory = FactoryProducer.getFactory("simple");
		 Shape shape1 = shapeFactory.getShape("RECTANGLE");
		 shape1.draw();
		 
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      shape2.draw();
	     
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("rounded");
	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	      shape3.draw();
	     
	      Shape shape4 = shapeFactory1.getShape("SQUARE");
	      shape4.draw();

	}

}
