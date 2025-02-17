package recursionProb;

public class Fibonnaci {

	public static void main(String[] args) 
	{
		System.out.println(fibTerm(10));
		
		System.out.println(fibTerm(2));

	}
	public static int fibTerm(int n)
	{
		if(n==1 || n==2)
			return 1;
		int result=fibTerm(n-1)+fibTerm(n-2);
		return result;
		
	}

}
