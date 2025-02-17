package selection;

public class Compare {

	public static void main(String[] args) 
	{
		int result = compare(20,30);
		if(result>=0)
		{
			System.out.println("fail : TC01 : -1 , "+result);
		}
		
		result = compare(31,21);
		if(result<=0)
		{
			System.out.println("fail : TC02 : 1 , "+result);
		}
		
		result = compare(3,3);
		if(result!=0)
		{
			System.out.println("fail : TC03 : 0 , "+result);
		}
		
		System.out.println("Test Completed");
		
	}
	public static int compare(int a,int b)
	{
//		return a-b;
		int res=0;
		if(a<b)
		{
			res=-1;
		}
		else if(a>b)
		{
			res=1;
		}
		return res;
	}

}
