package recursionProb;

public class Power {

	public static void main(String[] args) 
	{
		int result=power(2,3);
		System.out.println(result);
		
		result=power(2,0);
		System.out.println(result);
		
		result=power(4,4);
		System.out.println(result);
		
		result=power(2,8);
		System.out.println(result);
		
		System.out.println(fastExpo(2313,3434));
		
		//System.out.println(fastExpo(2,11));
		
				

	}
	
	public static int power(int a, int n)
	{
		if(n==0)
			return 1;
		
		int result=a*power(a,n-1);
		return result;
	}
	
	public static int fastExpo(int a, int n)
	{
		if(n==0)
			return 1;
		
		if(n==1)
			return a;
		
		int result=fastExpo(a,n/2);
		if(n%2==0)
				return result*result;
		else
			return result*result*a;
	}

}
