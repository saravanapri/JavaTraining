package nested;

import java.util.Arrays;

import arrayprob.RightRotate;

public class Rotate {

	public static void main(String[] args) 
	{
		int a[]= {5,10,15,20,25,30};
		rotateN(a,4);
		System.out.println(Arrays.toString(a));
		
		
	}
	public static void rotateN(int[] a, int n)
	{
		int i=0;
		while(i<n)
		{
			RightRotate.rightRotate2(a);
			i++;
		}
	}

}
