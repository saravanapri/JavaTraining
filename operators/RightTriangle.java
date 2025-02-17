package operators;

public class RightTriangle {

	public static void main(String[] args)
	{
		boolean result=isRightTriangle(5,12,13);
		System.out.println(result);
		
		result=isRightTriangle(2,3,5);
		System.out.println(result);
		
	}
	public static boolean isRightTriangle(int a,int b,int c)
	{
		boolean res= ( a*a + b*b == c*c ) || (b*b + c*c == a*a) || (a*a + c*c == b*b);
		return res;
	}

}
