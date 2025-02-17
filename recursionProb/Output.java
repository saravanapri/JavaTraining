package recursionProb;

public class Output {

	public static void main(String[] args) 
	{
		recur(3);

	}
	public static void recur(int n)
	{
		if(n==0)
			return;
		System.out.println("Entering :"+n);
		recur(n-1);
		System.out.println("Leaving :"+n);
		return;
	}

}
