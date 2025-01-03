package arrayprob;

public class RightRotate {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,8,10};
		rightRotate(a);
		ArrayPrint.print(a);

		int b[]= {5,10,15,20,25,30};
		rightRotate2(b);
		ArrayPrint.print(b);

	}
	public static void rightRotate(int a[])
	{
		int i=0,temp;
		int last=a.length-1;
		while(i<a.length)
		{
			temp=a[i];
			a[i]=a[last];
			a[last]=temp;
			i++;
		}
	}
	public static void rightRotate2(int a[])
	{
		int last=a.length-1;
		int i=last,temp=a[last];
		while(i!=0)
		{
			a[i]=a[i-1];
			i--;
		}
		a[i]=temp;
	}

}
