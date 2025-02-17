package stringset;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		boolean result=findAnagram("file","Life");
		System.out.println(result);
		
		result=findAnagram("dog","god");
		System.out.println(result);
		
		result=findAnagram("abbc","abcc");
		System.out.println(result);
		
		result=findAnagram("abcce","abcdef");
		System.out.println(result);
		
		result=findAnagram("abb","bab");
		System.out.println(result);
		
		result=findAnagram("abbc","adcc");
		System.out.println(result);
		
		result=findAnagram("azz","zza");
		System.out.println(result);
				
	}
	public static boolean findAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int count[]=new int[26];
		int count1[]=new int[26];
		
		if(s1.length()!=s2.length())
			return false;
		
		int i=0;
		while(i<s1.length())
		{
			count[s1.charAt(i)-97]++;
			count1[s2.charAt(i)-97]++;
			i++;
		}
		return Arrays.equals(count,count1);
	
	}
	
//	public static boolean findAnagram(String s1,String s2)
//	{
//		s1=s1.toLowerCase();
//		s2=s2.toLowerCase();
//		
//		
//	}
//	public static void sort(String s1)
//	{
//		
//	}
	

}
