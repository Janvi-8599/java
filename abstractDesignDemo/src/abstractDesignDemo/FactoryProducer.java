package abstractDesignDemo;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String s)
	{
		if(s.equalsIgnoreCase("samsung"))
		{
			return new SamsungFactory();
		}
		else if(s.equalsIgnoreCase("Redmi"))
		{
			return new XiaomiFactory();
		}
		else
		{
			return null;
		}
	}
	
}
