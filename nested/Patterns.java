package nested;

import loopProblems.Histogram;

public class Patterns {

	public static void main(String[] args) 
	{
		int a[]= {3,2,4,6};
		hHist(a);
		
		print1(4);
		System.out.println();
		
		print2(4);
		System.out.println();
		
		print3(4);
		System.out.println();
		
		print4(4);
		System.out.println();

	}
	public static void printLine(int num, String c)
	{
		int i=0;
		while(i<num)
		{
			System.out.print(c);
			i++;
		}
		System.out.println();
	}

	public static void hHist(int[] a)
	{
		int i=0;
		while(i<a.length)
		{
			printLine(a[i],"-");
			i++;
		}
	}
	
	
	public static void print1(int n)
	{
		int i=0;
		while(i<n)
		{
			printLine(i+1,"* ");
			i++;
		}
	}
	
	public static void print2(int n)
	{
		int i=0;
		while(i<n)
		{
			printLine(n-i,"* ");
			i++;
		}
	}
	
	public static void print3(int n)
	{
		int i=0;
		while(i<n)
		{
			int j=n-i-1;
			while(j>=0)
			{
				System.out.print(' ');
				j--;
			}
			printLine(i+1,"* ");
//			int k=0;
//			while(k<=i)
//			{
//				System.out.print("* ");
//				k++;
//			}
//			System.out.println();

			i++;
		}
	}
	
	public static void print4(int n)
	{
		int i=0;
		while(i<n)
		{
			int j=0;
			while(j<n-i-1)
			{
				System.out.print(' ');
				j++;
			}
			printLine(i+1,"*");
			i++;
		}
	}

}
