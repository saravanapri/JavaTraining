package selection;

public class Middle {

	public static void main(String[] args) 
	{
		int result = isMiddle(3,9,5);
		System.out.println(result);
	
		result = isMiddle(6,1,8);
		System.out.println(result);
	
		result = isMiddle(5,9,3);
		System.out.println(result);
	
		result = isMiddle(10,9,3);
		System.out.println(result);
	
		result = isMiddle(-10,9,-3);
		System.out.println(result);
	

	}
	public static int isMiddle(int a, int b, int c)
	{
		int middle;
		if((a>b && a<c) || (a>c && a<b))
		{
			middle=a;
		}
		else if((b>a && b<c) || (b>c && b<a))
		{
			middle=b;
		}
		else //if((c>a && c<b) || (c>b && c<a))
		{
			middle=c;
		}
		return middle;
	}

}
