package recursionProb;

import arrayprob.ArrayPrint;

public class ArrReverse {

	public static void main(String[] args) 
	{
		int a[]= {5,10,15,20,25,30,35,40,45,50};
		reverse(a);
		ArrayPrint.print(a);

	}
	public static void reverse(int a[])
	{
		reverse(a,0,a.length);
	}
	
	public static void reverse(int y[],int start, int end)
	{
		System.out.print("start " + start);
		System.out.print("end " + end);
		System.out.println();
		if(start >= end)
			return;
		
		int temp=y[end-1];
		y[end-1]=y[start];
		y[start]=temp;
		
		reverse(y,start+1,end-1);
		return;
		
	}

}
