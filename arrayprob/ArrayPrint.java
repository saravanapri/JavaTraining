package arrayprob;

public class ArrayPrint {

	public static void main(String[] args) 
	{
		int m[]= {1,2,3,4,5,6,7,8,9,10};
		print(m);
		printReverse(m);
	}
	public static void print(int m[])
	{
		int i=0;
		while(i<m.length)
		{
			System.out.print(m[i]+" ");
			i++;
		}
		System.out.println();
	}
	public static void printReverse(int m[])
	{
		int i=m.length-1;
		while(i>=0)
		{
			System.out.print(m[i]+" ");
			i--;
		}
	}

}
