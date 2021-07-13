package abstractDesignPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(String s)
	{
		if(s.equalsIgnoreCase("simple"))
		{
			return new ShapeFactory();
		}
		else if(s.equalsIgnoreCase("rounded"))
		{
			return new RoundedShapeFactory();
		}
		else
		{
			return null;
		}
	}
}
