package arrayprob;

public class LinearSearch {

	public static void main(String[] args)
	{
		int a[]= {10,20,40,30,90,60};
		int n=40;
		int result=search(a,n);
		System.out.println(result);
		
		int b[]= {78,89,95,76,98};
		n=40;
		result=search(b,n);
		System.out.println(result);

	}
	public static int search(int a[],int n)
	{
		int i=0;
		while(i<a.length)
		{
			if(a[i]==n)
			{
				return i;
			}
			i++;
		}
		return -1;
	}

}
