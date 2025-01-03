package arrayprob;

public class Duplicate {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10};
		int result[]=duplicate(a);
		ArrayPrint.print(result);

	}
	public static int[] duplicate(int a[]) 
	{
		int b[] = new int[a.length];
		int i=0;
		while(i<a.length)
		{
			b[i]=a[i];
			i++;
		}
		return b;
	}

}
