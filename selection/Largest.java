package selection;

public class Largest {

	public static void main(String[] args)
	{
		int result=findLargest(1,2,23);
		System.out.println(result);
		
		result=findLargest(10,2,3);
		System.out.println(result);
		
		result=findLargest(3,2,3);
		System.out.println(result);
		
		result=findLargest(3,24,4);
		System.out.println(result);

	}
	public static int findLargest(int a, int b, int c)
	{
		int large = a;
		if(b>=large)
		{
			large=b;
		}
		if(c>=large)
		{
			large=c;
		}
		return large;
	}

}
