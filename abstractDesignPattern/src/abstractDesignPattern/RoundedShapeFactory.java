package abstractDesignPattern;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String s) {
		if(s.equalsIgnoreCase("rectangle"))
		{
			return new RoundedRectangle();
		}
		else if(s.equalsIgnoreCase("square"))
		{
			return new RoundedSquare();
		}
		else
		{
			return null;
		}
			
	}

}
