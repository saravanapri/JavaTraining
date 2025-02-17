package operators;

public class RelationalOp {

	public static void main(String[] args) 
	{
		System.out.println("Smallest number cases");
		boolean result= isSmallest(1,2,5);
		System.out.println(result);
		
		result= isSmallest(2,2,5);
		System.out.println(result);
		
		result= isSmallest(12,2,2);
		System.out.println(result);
		
		System.out.println("Largest number cases");
		result= isLargest(12,3,5);
		System.out.println(result);

		result= isLargest(12,12,11);
		System.out.println(result);

		result= isLargest(1,12,5);
		System.out.println(result);

		System.out.println("Between cases");
		result= isBetween(3,2,5);
		System.out.println(result);
		
		result= isBetween(3,5,2);
		System.out.println(result);
		
		result= isBetween(6,5,2);
		System.out.println(result);
		
		System.out.println("Outside cases");
		result= isOutside(1,2,5);
		System.out.println(result);
		
		result= isOutside(1,5,2);              
		System.out.println(result);		
		
		result= isOutside(3,5,2);
		System.out.println(result);		
		
		result= isOutside(6,5,2);
		System.out.println(result);		
		
		System.out.println("Equal cases");
		result= isEqual(2,2,2);
		System.out.println(result);
		
		result= isEqual(1,2,3);
		System.out.println(result);

		System.out.println("Any two Equal cases");
		result= isAny2Equal(2,2,3);
		System.out.println(result);
		
		result= isAny2Equal(2,2,2);
		System.out.println(result);
		
		result= isAny2Equal(3,2,2);
		System.out.println(result);
		
		result= isAny2Equal(1,2,3);
		System.out.println(result);
		
		System.out.println("Only two Equal cases");
		result= isOnly2Equal(2,2,2);
		System.out.println(result);

		result= isOnly2Equal(5,2,2);
		System.out.println(result);

		result= isOnly2Equal(2,2,5);
		System.out.println(result);

		result= isOnly2Equal(5,3,4);
		System.out.println(result);

		System.out.println("NotEqual cases");
		result= isDifferent(3,3,3);
		System.out.println(result);
		
		result= isDifferent(1,2,3);
		System.out.println(result);
	}
	public static boolean isSmallest(int a,int b,int c)
	{
		boolean res = a<=b && a<=c;
		return res;
	}
	public static boolean isLargest(int a,int b,int c)
	{
		boolean res = a>=b && a>=c;
		return res;
	}
	public static boolean isBetween(int a,int b,int c)
	{
		boolean res = (a>b && a<c) || (a>c && a<b);
		return res;
	}
	public static boolean isOutside(int a,int b,int c)
	{
		boolean res = (a<b && a<c) || (a>b && a>c);
		return res;
	}
	public static boolean isEqual(int a,int b,int c)
	{
		boolean res = a==b && a==c;
		return res;
	}
	public static boolean isAny2Equal(int a,int b,int c)
	{
		boolean res = a==b || a==c || b==c;
		return res;
	}
	public static boolean isOnly2Equal(int a,int b,int c)
	{
		boolean res = (a==b && a!=c) || (b==c && b!=a) || (a==c && a!=b);
		return res;
	}
	public static boolean isDifferent(int a,int b,int c)
	{
		boolean res= a!=b && b!=c && a!=c;
		return res;
	}
	
	

}
