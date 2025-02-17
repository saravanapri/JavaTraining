package recursionProb;

public class Search {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10,12,14,16};
		System.out.println(binarySearch(a,14));
		
		System.out.println(binarySearch(a,4));
		
		System.out.println(binarySearch(a,10));
		
		System.out.println(binarySearch(a,18));
		
		int b[]= {2,4,6,8,10,12,14,16,18};
		
		System.out.println(binarySearch(b,12));
		

	}
	
	public static int binarySearch(int a[],int n)
	{
		return binarySearch(a,n,0,a.length);	
	}
	
	private static int binarySearch(int []a,int search,int start,int end)
	{
		int mid=start+(end-start)/2;
		
		if(start>=end)
			return -1;
		
		if(search==a[mid])
			return mid;
		
		else if(search<a[mid])
			return binarySearch(a,search,start,mid-1);
		
		else
			return binarySearch(a,search,mid+1,end);
			
		
	}

}
