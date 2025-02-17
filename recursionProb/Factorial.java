package recursionProb;

public class Factorial {

	public static void main(String[] args) 
	{
		int result = factorial(5);
		System.out.println(result);
		
		result = factorial(0);
		System.out.println(result);
		
		result = factorial(1);
		System.out.println(result);
	}
	
	public static int factorial(int n)
	{
		if(n==1 || n==0)
			return 1;
		int result=n*factorial(n-1);
		return result;
	}

}
