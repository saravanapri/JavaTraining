package arrayprob;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10,12,14,16};
		int result=binarySearch(a,4);
        System.out.println(result);
        
        int b[]= {12,42,68,80,100,110,120,140,160};
		result=binarySearch(b,160);
        System.out.println(result);
        
        int c[]= {3,4,6,8,10,11};
		result=binarySearch(c,6);
        System.out.println(result);
        
        int d[]= {3,4,6,8,10};
		result=binarySearch(d,11);
        System.out.println(result);
        
	}
	public static int binarySearch(int a[],int n)
	{
		int end=a.length;
		int start=0;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(n==a[mid])
			{
				return mid;
			}
			else if(n<a[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
	}

}
