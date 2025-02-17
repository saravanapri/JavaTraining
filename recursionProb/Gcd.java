package recursionProb;

public class Gcd {

	public static void main(String[] args) 
	{
		System.out.println(findGcd(18,24));

		System.out.println(findGcd(24,18));

		System.out.println(findGcd(0,18));

		System.out.println(findGcd(18,0));

		System.out.println(findGcd(13,11));

	}
	
	public static int findGcd(int a,int b)
	{
		if(a==0)
			return b;
		
		return findGcd(b%a,a);
	}

}
