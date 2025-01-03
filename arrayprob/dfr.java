package arrayprob;

public class dfr {

	public static void main(String[] args) 
    {
       int[] a={1,2,1,2,1,1,0,1,2,0};
        int low=0,temp,high=a.length-1,mid=0;
        while(mid<=high)
        {
        	if(a[mid]==0)
        	{
        		temp=a[low];
        		a[low]=a[mid];
        		a[mid]=temp;
        		mid++;
        		low++;
        	}
        	else if(a[mid]==1)
        	{
        		mid++;
        	}
        	else
        	{
        		temp=a[mid];
        		a[mid]=a[high];
        		a[high]=temp;
        		high--;
        	}
        	
        }
        int i=0;
        while(i<a.length)
        {
        	System.out.print(a[i]+" ");
        	i++;
        }
    }

}
