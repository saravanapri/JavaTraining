package selection;

public class Odd {

	public static void main(String[] args) 
	{
		int result=nearestOdd(11.0);
		System.out.println(result);
		
		result=nearestOdd(0.0);
		System.out.println(result);
		
		result=nearestOdd(12.0);
		System.out.println(result);
		
		result=nearestOdd(12.1);
		System.out.println(result);
		
		result=nearestOdd(-13.2);
		System.out.println(result);
		
		result=nearestOdd(-11.1);
		System.out.println(result);
		
		result=nearestOdd(-12.2);
		System.out.println(result);
		
		result=nearestOdd(-12.9);
		System.out.println(result);
	}
	public static int nearestOdd1(double a)
	{
		int b=(int) a;
		if(a%2!=0)
		{
			if(b %2 !=0)
			{
				return b;
			}
			else if(b>0)
			{
				return b+1;
			}
			else
			{
				return b-1;
			}
		}
		if(b<=0)
		{
		  return b+1;
		}
		else
		{
		  return b-1;
		}
		
	}
	

 	public static int nearestOdd(double a)
	{
		a=a>=0?a+0.9:a-0.9;
		int res=(int)a;
		if(res%2!=0)
		{
			return res;
		}
		else if(res>0)
		{
			return res-1;
		}
		else
		{
			return res +1;
		}
		
	}

}
