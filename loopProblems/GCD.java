package loopProblems;

public class GCD {

	public static void main(String[] args) 
	{
		System.out.println(gcd(18,24));

		System.out.println(gcd(24,18));

		System.out.println(gcd(0,18));

		System.out.println(gcd(18,0));
	
		System.out.println(gcd(13,11));
		
	}
	public static int gcd(int a,int b)
	{
		int temp;
		while(a!=0)
		{
			temp=a;
			a=b%a;
			b=temp;
		}
		return b;
	}

}
