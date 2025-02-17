package stringset;

import java.util.Arrays;

import arrayprob.ArrayPrint;
import nested.ArrayHistogram;

public class CountAlpha {

	public static void main(String[] args) 
	{
		int result[]=count("aaabbbccccddd");
		System.out.println(Arrays.toString(result));
		
		ArrayHistogram.hHist(result);
		
		result=count("kkkksszzttttt");
		System.out.println(Arrays.toString(result));
		
		
	}
	public static int[] count(String str)
	{
		int c[]=new int[26];
		int i=0;
		while(i<str.length())
		{
			c[str.charAt(i)-'a']++;
			i++;
		}
		return c;
	}

}
