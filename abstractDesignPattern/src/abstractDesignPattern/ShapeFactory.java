package abstractDesignPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String s) {
		
		if(s.equalsIgnoreCase("rectangle"))
		{
			return new Rectangle();
		}
		else if(s.equalsIgnoreCase("square"))
		{
			return new Square();
		}
		else
		{
			return null;
		}
			
	}

}
