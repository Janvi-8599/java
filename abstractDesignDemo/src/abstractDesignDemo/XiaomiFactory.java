package abstractDesignDemo;

public class XiaomiFactory extends AbstractFactory{

	@Override
	public IMobile getMobile(String s) {
		if(s.equalsIgnoreCase("mobile"))
		{
			return new RedmiPro();
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
			return new RedmiProSignal();
		}
		else
		{
			return null;
		}
	}

}
