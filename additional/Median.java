package additional;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) 
	{
//		int a[]= {1, 3, 4, 2, 6, 5, 8, 7};
//		System.out.println(findMedian(a));
		
		int b[]= {1, 3, 4, 2, 6, 5, 8, 7,10};
		System.out.println(findMedian2(b,0,b.length-1));

	}
	
	public static double findMedian(int[] a)
	{
		int mid=a.length/2;
		Arrays.sort(a);
		if(a.length%2!=0)
		{
			return a[mid];
		}
		else
		{
			return (double)(a[mid]+a[mid-1])/2;
		}
			
	}
	
	public static double findMedian2(int[] a,int start,int end)
	{
		int mid=a.length/2;
		int p=partition(a,start,end);
		System.out.println(p);
		if(start<=end)
		{
			if(p==mid)
			{
				return a[p];
			}
			else if(p>mid)
			{
				return findMedian2(a,start,p-1);
			}
			else
			{
				return findMedian2(a,p+1,end);
			}
		}
		return a[mid];
	}
	
	public static int partition(int[] a, int left, int right) 
	{
        int pivot = a[right]; 
        int i = left - 1;  // 'i' points to the position before the leftmost element

        for (int j = left; j < right; j++) 
        {
            if (a[j] <= pivot) {
                i++;
                // Swap elements at i and j
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[right];
        a[right] = temp;

        // Return the pivot index
        return i + 1;
	}
	
}
