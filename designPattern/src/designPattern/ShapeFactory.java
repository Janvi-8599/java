package designPattern;

public class ShapeFactory {

		Shape getShape(String s)
		{
			if(s == null)
			{
				return null;
			}
			else if(s.equals("Square"))
			{
				return new Square();
			}
			else if(s.equals("Circle"))
			{
				return new Circle();
			}
			else if(s.equals("Rectangle"))
			{
				return new Rectangle();
			}
			else
			{
				return null;
			}
			
		}
}
