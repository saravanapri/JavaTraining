package loopProblems;

public class Fibonnaci {

	public static void main(String[] args) 
	{
		fibo(5);
		fibo(10);
		fibo(1);

	}
	public static void fibo(int n)
	{
		int prev=0, series=1,i=0,result=1;;
		while(i<n)
		{
			System.out.print(result+" ");
			result=series+prev;
			prev=series;
			series=result;
			i++;
		}
		System.out.println();
	}

}
