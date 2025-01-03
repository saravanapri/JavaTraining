package arrayprob;

public class MergeSort {

	public static void main(String[] args) 
	{
		int a[]= {2,5,10,12};
		int b[]= {3,4,6,11};
		int c[]= {3,4,6,11,13,15};
		int d[]= {2,5,15};
		int e[]= {2,5,10,14};
		
		int result1[]=merge(a,b);
		ArrayPrint.print(result1);
		
		int result2[]=merge(a,c);
		ArrayPrint.print(result2);

		int result3[]=merge(d,e);
		ArrayPrint.print(result3);
	}
	public static int[] merge(int a[],int b[])
	{
		int length=a.length+b.length;
		int c[]=new int[length];
		int i=0,j=0,k=0;
		while(k<length)
		{
			if(i== a.length)
			{
				c[k]=b[j];
				j++;
				//System.out.println(c[k]);
			}
			else if(j== b.length)
			{
				c[k]=a[i];
				i++;
			}
			else if(a[i]<b[j])
			{
				c[k]=a[i];
			    i++;
			}
			else
			{
				c[k]=b[j];
				j++;
			}
			//System.out.println(c[k]);
			k++;
		}
		return c;
	}

}
