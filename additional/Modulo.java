package additional;

import recursionProb.Power;

public class Modulo {

	public static void main(String[] args)
	{
		System.out.println(findModulo(2,3,8));
		
		System.out.println(findModulo(2312,3424,6789));
		
		System.out.println(findModulo(2,5,13));
				

	}
	
	
//	public static int findModulo2(int a,int n,int m)
//	{
//		return a%m)
//	}
	public static int findModulo(int a,int n,int m)
	{
		if(n==0)
			return 1;
		if(n==1)
			return a%m;
		int result=findModulo(a%m,(n%m)/2,m);
		if(n%2==0)
			return (result*result)%m;
		else
			return (a%m *result*result)%m;
	}

}
