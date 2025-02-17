package stringset;

import charprograms.ConvertLow;
import javaset1.Random;

public class StringBuild {

	public static void main(String[] args)
	{
		String str = reversestr("program");
		System.out.println(str);
		
		String str2 = lowerstr("PROGRAM");
		System.out.println(str2);
		
		str = removeVowels("program");
		System.out.println(str);
		
		str = removeVowels("aeiou");
		System.out.println(str);
		
		str = otpGen(5);
		System.out.println(str);
		
	}
	public static String reversestr(String str)
	{
		StringBuilder sb=new StringBuilder();
		int i=str.length()-1;
		while(i>=0)
		{
			sb.append(str.charAt(i));
			i--;
		}
		return sb.toString();
		
	}
	
	public static String lowerstr(String str2)
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str2.length())
		{
			sb.append(ConvertLow.toLower(str2.charAt(i)));
			i++;
			
		}
		return sb.toString();
		
	}
	
	public static String removeVowels(String str)
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length())
		{
			char c=str.charAt(i);
			if(c!='a'&& c !='e'&& c !='i' && c !='o'&& c !='u'&& c !='A' && c!='E'&& c!='I'&& c !='O'&& c!='U')
			{
				sb.append(c);
			}
			i++;
		}
		return sb.toString();
	}
	
	public static String otpGen(int n)
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<n)
		{
			sb.append((char)Random.randInt('a','z'+1));
			i++;
		}
		return sb.toString();
		
	}

}
