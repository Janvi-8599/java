package designPattern;
import java.io.*;
import java.util.*;


public class FactoryPatterndemo{

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		ShapeFactory sf = new ShapeFactory();
		Shape s1 = sf.getShape(s);
		s1.draw();
	}

}
