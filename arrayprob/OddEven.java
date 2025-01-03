package arrayprob;

public class OddEven {

	public static void main(String[] args) 
	{
		int[] a= {4,6,2,7,15,19,67,38};
		int[] b= {9,11,25,4,15,89,67,35};
		int[] c= {9,11,25,4,15,8,67,33};
		int start=0,end=a.length-1;
		partition(a,start,end);
		ArrayPrint.print(a);

	}
	public static void partition(int[]a,int left,int right)
	{
		int pivotpos=right;
		right=right-1;
		while(left<=right)
		{
			while(left<=right && a[left]%2==0)
			{
				left++;
			}
			while(left<=right && a[right]%2!=0)
			{
				right--;
			}
			if(left<=right)
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		int temp=a[left];
		a[left]=a[pivotpos];
		a[pivotpos]=temp;
	}
	

}
