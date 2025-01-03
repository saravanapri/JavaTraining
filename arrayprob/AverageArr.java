package arrayprob;

public class AverageArr {

	public static void main(String[] args) 
	{
		int a[]= {78,89,95,76,98};
		double result=mean(a);
		System.out.println(result);

		int b[]= {78,89,95};
		result=mean(b);
		System.out.println(result);
		
		int c[]= {100,100,100,100};
		result=mean(c);
		System.out.println(result);

	}
	public static double mean(int a[])
	{
		int i=0;
		int sum=0;
		while(i<a.length)
		{
			sum=sum+a[i];
			i++;
		}
		return (double)sum/a.length;
	}

}
