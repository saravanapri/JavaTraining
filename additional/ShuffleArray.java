package additional;

import arrayprob.ArrayPrint;

public class ShuffleArray {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10};
		arrayShuffle(a);
		ArrayPrint.print(a);

	}
	
	public static void arrayShuffle(int[] a)
	{
		int i;
		for(i=a.length-1;i>=0;i--)
		{
			int j= (int) (Math.random() * (i+1));//A proper shuffle requires swapping elements within the remaining unshuffled portion of the array.
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

}
