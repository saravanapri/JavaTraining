package nested;

import arrayprob.ArrayPrint;
import arrayprob.LargestArr;
import loopProblems.Histogram;

public class ArrayHistogram {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,4};
		hHist(a);
		
		vHistogram(a);
		ArrayPrint.print(a);
		
	}
	public static void hHist(int[] a)
	{
		int i=0;
		while(i<a.length)
		{
			Histogram.print(a[i]);
			i++;
		}
	}
	public static void vHistogram(int[]b)
	{
		int large=LargestArr.largest(b);
		while(large>0)
		{
			int i=0;
			while(i<b.length)
			{
				Histogram.printver(b[i], large);
				i++;
			}
			large--;
			System.out.println();
		}
	}

}
