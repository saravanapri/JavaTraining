package loopProblems;

public class Reverse {

	public static void main(String[] args) 
	{
		int result=reverse(456);
		if(result!=654)
		{
			System.out.println("fail : TC01 : 654 , "+result);
		}
		
		result=reverse(14056);
		if(result!=65041)
		{
			System.out.println("fail : TC02 : 65041 , "+result);
		}
		
		result=reverse(202);
		if(result!=202)
		{
			System.out.println("fail : TC03 : 202 , "+result);
		}
		
		result=reverse(0);
		if(result!=0)
		{
			System.out.println("fail : TC04 : 0 , "+result);
		}
		System.out.println("Test Completed");
		
		
		
	}
	public static int reverse(int num)
	{
	    int sum=0, digit;
		while(num!=0)
		{
			digit=num%10;
			sum=sum*10+digit;
			num=num/10;
		}
		System.out.println(sum);
		return sum;
	}
  
}
