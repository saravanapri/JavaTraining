package arrayprob;

public class Equal {

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,6,7,8};
		int b[]= {2,3,4,6,7};
		boolean result=isEqual(a,b);
		System.out.println(result);
		
		int c[]= {2,3,4,6,7};
		int d[]= {2,3,4,6,7,8};
		result=isEqual(c,d);
		System.out.println(result);
		
		result=isEqual(b,c);
		System.out.println(result);
		
		int e[]= {2,3,5,6,7};
		result=isEqual(b,e);
		System.out.println(result);

	}
	public static boolean isEqual(int a[], int b[])
	{
		int i=0;
		if(a.length!=b.length)
		{
			return false;
		}
		else
		{
			while(i<a.length)
			{
				if(a[i]!=b[i])
				{
					return false;
				}
				i++;
			}
		}
		return true;
	}

}
