package loopProblems;

public class Power {

	public static void main(String[] args) {
		double result = pow(10, 3);
		System.out.println(result);

		result = pow(2, 0);
		System.out.println(result);
		
		result = pow(0, 0);
		System.out.println(result);
		
		result = pow(0, 5);
		System.out.println(result);
		
		result = pow(-9, 2);
		System.out.println(result);
		
		result = pow(-3,-3);
		System.out.println(result);
		
		result = pow(-2,-2);
		System.out.println(result);
	}
	public static double pow(int base, int power)
	{
		int res=1, i=1;
		while(i<=Math.abs(power))
		{
			res=res*base;
			i++;
		}
		if(power>=0)
		{
			return res;
		}
		else
		{
			return 1.0/res;
		}
	}
}
