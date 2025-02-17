package loopProblems;

public class Factorial {

	public static void main(String[] args) 
	{
		int result= factorial(5);
		System.out.println(result);

		result= factorial(4);
		System.out.println(result);

		result= factorial(0);
		System.out.println(result);

		result= factorial(12);
		System.out.println(result);

	}
	public static int factorial(int n)
	{
		int i=1,result=1;
		while(i<=n)
		{
			result=result*i;
			i++;
		}
		return result;
	}

}
