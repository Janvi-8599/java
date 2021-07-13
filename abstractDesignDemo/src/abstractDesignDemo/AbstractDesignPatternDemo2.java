package abstractDesignDemo;

import java.util.ArrayList;

public class AbstractDesignPatternDemo2 {

	public static void main(String[] args) {
		 AbstractFactory factory = FactoryProducer.getFactory("samsung");
		 IMobile m = factory.getMobile("mobile");
		 ISignal s = factory.getSignal("signal");
		 m.getPhone();
		 s.getSignal();
		 
		 AbstractFactory f = FactoryProducer.getFactory("Redmi");
		 IMobile m1 = f.getMobile("mobile");
		 ISignal s1 = f.getSignal("signal");
		 m1.getPhone();
		 s1.getSignal();
		 
		 
		 ArrayList<Integer> a = new ArrayList<>();
		 
	}

}

