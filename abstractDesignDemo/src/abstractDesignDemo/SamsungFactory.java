package abstractDesignDemo;

public class SamsungFactory extends AbstractFactory{
	@Override
	public IMobile getMobile(String s) {
		if(s.equalsIgnoreCase("mobile"))
		{
			return new Samsung();
		}
		else
		{
			return null;
		}
	}

	@Override
	public ISignal getSignal(String s) {
		if(s.equalsIgnoreCase("signal"))
		{
			return new SamsungSignal();
		}
		else
		{
			return null;
		}
	}

}
