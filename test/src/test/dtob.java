package test;

public class dtob {
	static String decToBin(int n)
    {
        if (n == 0)
            return "0";
        String bin = "";
         
        while (n > 0)
        {   
        	bin = ((n & 1) == 0 ? '0' : '1') + bin;
            // right shift 'n' by 1
            n >>= 1;
        }         
        return bin;
    }
	
	public static void main(String[] args) {
		int a = 0xA;
		String s = "";
		StringBuffer sbr = new StringBuffer(s);
       
		while(a>0)
		{
			int k = a % 2;
			a = a/2;
			sbr.append(k);
		}
		 sbr.reverse();
	     System.out.println("using simple method"+ sbr);
	     
	     System.out.println("using bitwise"+decToBin(0xA));
	}
}
