package recursionProb;

public class IntegerToStr {

	public static void main(String[] args) 
	{
		System.out.println(int2String(8765400));

	}
	public static String int2String(int n)
	{	
		if(n==0)
			return "";
		
		String str=int2String(n/10)+n%10;
		
		return str;
	}

}
