package loopProblems;

import selection.Largest;

public class Histogram {

	public static void main(String[] args) 
	{
		//horizontalHist(6,4,7);
		//verticalHist(7,4,6);
		verticalHist2(2,10,4);

	}
	public static void horizontalHist(int a,int b,int c)
	{
		print(a);
		print(b);
		print(c);
	}
	public static void print(int num)
	{
		int i=0;
		System.out.print(num+" : ");
		while(i<num)
		{
			System.out.print("- ");
			i++;
		}
		System.out.println();
	}
	
	public static void verticalHist(int a,int b,int c)
	{
		int large=Largest.findLargest(a,b,c);
		while(large>0)
		{
			int i=0;
			while(i<3)
			{
				if(i==0 && a==large)
				{
					System.out.print("|");
					a--;
				}
				else if(i==1 && b==large)
				{
					System.out.print("|");
					b--;
					
				}
				else if(i==2 && c==large)
				{
					System.out.print("|");
					c--;
				}
				else
				{
					System.out.print(" ");
				}
				i++;
			}
			System.out.println();
			large--;
		}
	}
		
		public static void verticalHist2(int a,int b,int c)
		{
			int large=Largest.findLargest(a,b,c);
			while(large>0)
			{
				printver(a,large);
				printver(b,large);
				printver(c,large);
				large--;
				System.out.println();
			}
			
		}
		public static void printver(int num, int lar)
		{
			if(num>=lar)
			{
				System.out.print("|");
			}
			else
			{
				System.out.print(" ");
			}
		}
					
}

