package loopProblems;

public class Count {

	public static void main(String[] args)
	{
		int result= countDigits(130);
		System.out.println(result);
		
		result= countDigits(30);
		System.out.println(result);
		
		result= countDigits(1300);
		System.out.println(result);
		
		result= countDigits(1);
		System.out.println(result);
		
		result= countDigits(13000);
		System.out.println(result);

	}
	public static int countDigits(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count ++;
		}
		return count;
	}

}
