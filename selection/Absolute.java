package selection;

public class Absolute {

	public static void main(String[] args) 
	{
		int result=abs(-26);
		System.out.println(result);

		result=abs(7);
		System.out.println(result);

		result=abs(0);
		System.out.println(result);

		result=abs(Integer.MIN_VALUE);
		System.out.println(result);

		result=abs(Integer.MAX_VALUE);
		System.out.println(result);



	}
	public static int abs(int n)
	{
		if(n<0)
		{
			return -n;
		}
		return n;
	}

}
