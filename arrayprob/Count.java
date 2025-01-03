package arrayprob;

public class Count {

	public static void main(String[] args) 
	{
		int a[]= {10,10,10,12,10,11,12,11,12,10,11,10,10,12,12,12,12};
		int result[]=count012(a);
		ArrayPrint.print(result);
	}
	public static int[] count012(int a[])
	{
		int i=0,c;
		int count[]= new int[3];
		while(i<a.length)
		{
//			if(a[i]==0)
//			{
//				count[0]++;
//			}
//			else if(a[i]==1)
//			{
//				count[1]++;
//			}
//			else if(a[i]==2)
//			{
//				count[2]++;
//			}
			c=count[a[i]%10]++;
			System.out.println(c);
			i++;
		}
		//System.out.println("0's: "+count[0]+", 1's: "+count[1]+", 2's: "+count[2]);
		return count;
	}

}
