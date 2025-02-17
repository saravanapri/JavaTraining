package stringset;

import charprograms.Alphabet;

public class StringProb {

	public static void main(String[] args) 
	{
		
		int result=countLower("WelCome");
		System.out.println(result);
		
		result=countLower("WELCOME");
		System.out.println(result);
		
		result=countVowels("aEIOUDF");
		System.out.println(result);
		
		result=countVowels("AEIOU");
		System.out.println(result);
		
		result=countConsonants("RFGEIUO");
		System.out.println(result);
		
		result=countConsonants("Java");
		System.out.println(result);
		
		boolean result1=isPalindrome("Madam");
		System.out.println(result1);
		
		result1=isPalindrome("Apple");
		System.out.println(result1);
		
		result1=isStrongPassword("Msp1234");
		System.out.println(result1);
		
		result1=isStrongPassword("msp1234");
		System.out.println(result1);
		
		result1=isStrongPassword("1234");
		System.out.println(result1);
		
		result1=isStrongPassword("msp");
		System.out.println(result1);
		
		result1=isStrongPassword("Msp1");
		System.out.println(result1);
		
		result1=isStrongPassword("MSP1234");
		System.out.println(result1);
		
		System.out.println(countWords(" abc  cvg   hji uio "));
		
		System.out.println(countWords(" vgh"));
		
		System.out.println(countWords("  vgh"));

		System.out.println(countWords("word "));

		System.out.println(countWords("word 2"));

		System.out.println(countWords(""));
		
		System.out.println(countWords("word"));
		
		System.out.println(countWords("word\nabcd"));
		
		System.out.println(countWords("word\tabcd"));
	
	}
	
	public static int countLower(String str)
	{
		int count=0,i=0;
		while(i<str.length())
		{
			char c=str.charAt(i);
			if(Character.isLowerCase(c))
			{
				count++;
			}
			i++;
		}
		return count;
	}
	
	public static int countVowels(String str)
	{
		int count=0,i=0;
		while(i<str.length())
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count ++;
			}
			i++;
		}
		return count;
	}
	
	public static int countConsonants(String str)
	{
		int count=0,i=0;
		while(i<str.length())
		{
			char c=str.charAt(i);
			if(c!='a'&& c !='e'&& c !='i' && c !='o'&& c !='u'&& c !='A' && c!='E'&& c!='I'&& c !='O'&& c!='U')
			{
				count ++;
			}
			i++;
		}
		return count;	
	}
	
	public static boolean isPalindrome(String str)
	{
		str=str.toLowerCase();
		int i=0,last=str.length()-1;
		while(i<str.length()/2)
		{
			char first=str.charAt(i);
			char las=str.charAt(last);
			if(first!=las)
			{
				return false;
			}
			i++;
			last--;
		}
		return true;
	}
	public static boolean isStrongPassword(String str)
	{
		int len=str.length(),i=0,up=0,low=0,num=0;
		if(len>=5)
		{
			while(i<len)
			{
				char c=str.charAt(i);
				if(Character.isUpperCase(c))
				{
					up++;
				}
				else if(Character.isLowerCase(c))
				{
					low++;
				}
				else if(c>='0' && c<='9')
				{
					num++;
				}
				if(up>=1 && low>=1 && num>=1)
				{
					return true;
				}
				i++;
			}
		}
		return false;	
	}
	
	public static boolean isWhiteSpace(char c)
	{
		return c==' '||c=='\t'||c=='\n';
	}
	public static int countWords(String str)
	{
		int count=0,i=0,first=0;
		
		if(!isWhiteSpace(str.charAt(0)))
		{
			first=1;
		}
		
		while(i<str.length()-1)
		{
			if(isWhiteSpace(str.charAt(i)) && !isWhiteSpace(str.charAt(i+1)))
			{
				count++;
			}
			i++;
		}
		return count+first;
	}
	

}
