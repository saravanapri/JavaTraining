package operators;

public class PosNeg {

	public static void main(String[] args)
	{
		boolean result=isPositive(30);
		System.out.println(result);
		
		result=isNegative(-30);
		System.out.println(result);
		
		result=isPosOrNeg(30);
		System.out.println(result);
		
		result=isPosOrNeg(-30);
		System.out.println(result);
		
		System.out.println("Neither cases");
		result=isNeither(12);
		System.out.println(result);
	
		result=isNeither(-10);
		System.out.println(result);
		
		result=isNeither(0);
		System.out.println(result);
		
	    System.out.println("same sign cases");
		result=sameSign(30,40);
		System.out.println(result);
	
		result=sameSign(-30,-40);
		System.out.println(result);
	
		result=sameSign(0,-40);
		System.out.println(result);
		
		result=sameSign(0,0);
		System.out.println(result);
	
	}
	public static boolean isPositive(int n)
	{
		boolean res = n>0;
		return res;
	}
	public static boolean isNegative(int n)
	{
		boolean res = n<0;
		return res;
	}
	public static boolean isPosOrNeg(int n)
	{
		boolean res = n<0 || n>0;
		//n!=0;
		return res;
	}
	public static boolean isNeither(int n)
	{
		boolean res = n==0;
		return res;
	}
	public static boolean sameSign(int a,int b)
	{
		boolean res = (a<0 && b<0) || (a>=0 && b>=0);
		return res;
	}

}
