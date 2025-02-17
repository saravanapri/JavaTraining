package selection;

public class Triangle {

	public static void main(String[] args) 
	{
		int result=triangleType(1,2,3);
		System.out.println(result);
		
		result=triangleType(2,2,2);
		System.out.println(result);
		
		result=triangleType(2,2,3);
		System.out.println(result);
		
		result=triangleType(2,3,2);
		System.out.println(result);
		
		result=triangleType(3,4,5);
		System.out.println(result);

	}
	public static int triangleType(int a,int b,int c)
	{
		int type=0;
		if( a > c-b && b > a-c && c > b-a)
		{
			if(a==b && a==c)
			{
				type=3;
			}
			else if(a==b || b==c || c==a)
			{
				type=2;
			}
			else //if(a!=b && a!=c)
			{
				type=1;
			}
			
		}
		return type;
	}

}
