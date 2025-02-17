package javaset1;

public class LSD {

	public static void main(String[] args)
	{
		int result=leastDigit(10);
		System.out.println(result);
		
		result=leastDigit(245);
		System.out.println(result);
		
		result=leastDigit(58);
		System.out.println(result);
	}
	public static int leastDigit(int n)
	{
		return n%10;
	}

}
