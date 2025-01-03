package arrayprob;

public class LargestArr {

	public static void main(String[] args) 
	{
		int a[]= {60,70,50,30,20,100,10,40};
		int result=largest(a);
		System.out.println(result);
		
		int b[]= {60,100,50,20,100,10,40};
		result=largest(b);
		System.out.println(result);
		
	}
	public static int largest(int a[])
	{
		int i=0,large=0;
		while(i<a.length)
		{
			if(a[i]>=large)
			{
				large=a[i];
			}
			i++;
		}
		return large;
	}
}
