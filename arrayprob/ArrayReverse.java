package arrayprob;

public class ArrayReverse {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10,12,14};
		reverse(a);
		ArrayPrint.print(a);
		
		int b[]= {2,4,6,8,10,12};
		reverse(b);
		ArrayPrint.print(b);
		
	}
	public static void reverse(int[] a)
	{
		int last=a.length-1,temp;;
		int i=0;
		while(i<a.length/2)
		{
			temp=a[last-i];
			a[last-i]=a[i];
			a[i]=temp;
			i++;
		}
	}
	

}
