package arrayprob;

public class Ascending {

	public static void main(String[] args) 
	{
		int a[]={12, 18, 36, 43, 67, 87, 98};
		boolean result=isAscending(a);
		System.out.println(result);
		
		int b[]={12, 18, 36, 23, 67, 87, 98};
		result=isAscending(b);
		System.out.println(result);
		
	}
	public static boolean isAscending(int a[])
	{
		int i=0;
		while(i<a.length-1)
		{
			if(a[i]>a[i+1])
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
