package recursionProb;

import arrayprob.ArrayPrint;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]= {34,89,65,43,23,86,45,87};
		int b[]= {2,13,25,43,9,8,10};
		int start=0,end=a.length-1;
		quickSort(a,start,end);
		ArrayPrint.print(b);
	}
	public static int partition (int a[],int left,int right)
	{
		int pivot=a[right];
		int pivotpos=right;
		right=right-1;
		while(left<=right)
		{
			//System.out.println(left+" "+right);
			while(left<right && a[left]<=pivot)
			{
				left++;
			}
			while(left<right && a[right]>=pivot)
			{
				right--;
			}
			if(left<=right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
			}
		}
			int temp=a[left];
			a[left]=a[pivotpos];
			a[pivotpos]=temp;
		return left;
		
	}
	public static void quickSort(int a[],int start,int end)
	{
		if(start>=end)
			return;
		int p=partition(a,start,end);
		//System.out.println(p);
		//System.out.println("left");
		//ArrayPrint.print(a);
		quickSort(a,start,p-1);
		quickSort(a,p+1,end);
		//System.out.println("Right");
		//ArrayPrint.print(a);
	}

}
