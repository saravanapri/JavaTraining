package additional;

import java.util.Arrays;

public class ColorBalls {

	public static void main(String[] args) 
	{
		char[] ch= {'R','G','B','R','G','B','B','G','R'};
		Arrange(ch);
		System.out.println(Arrays.toString(ch));
		
		char[] ch1= {'R','R','R','R','R','B','B','B','R'};
		Arrange(ch1);
		System.out.println(Arrays.toString(ch1));
		
		char[] ch2= {'R','R','R','R','R','G','G','G'};
		Arrange(ch2);
		System.out.println(Arrays.toString(ch2));

	}
	
	public static void Arrange(char ch[])
	{
		int mid=0,low=0,high=ch.length-1;
		
		while(mid<high)
		{
			if(ch[mid]=='R')
			{
				char temp=ch[mid];
				ch[mid]=ch[low];
				ch[low]=temp;
				mid++;
				low++;
			}
			else if(ch[mid]=='G')
			{
				mid++;
			}
			else
			{
				char temp=ch[mid];
				ch[mid]=ch[high];
				ch[high]=temp;
				high--;
			}
		}
	}

}
