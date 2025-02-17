package stringset;

public class StringCompare {

	public static void main(String[] args) 
	{
		
		boolean result=isEqual("java","java");
		System.out.println(result);
		
		result=isEqual("java","program");
		System.out.println(result);
		
		result=isEqual("program","java");
		System.out.println(result);
		
		result=isEqual("problem","program");
		System.out.println(result);
		
		int result1=compare("Java","apple");
		System.out.println(result1);
		
		result1=compare("word","zebra");
		System.out.println(result1);
		
		result1=compare("Apply","Application");
		System.out.println(result1);
		
		result1=compare("sweets","sweet");
		System.out.println(result1);
		
		result1=compare("sweet","sweet");
		System.out.println(result1);
		
		result1=str2Integer("473");
		System.out.println(result1);
		
		result1=str2Integer("90004");
		System.out.println(result1);
		
		String res=otp(10);
		System.out.println(res);

	}
	public static boolean isEqual(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int i=0;
		if(s1.length()==s2.length())
		{
			while(i<s1.length())
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					return false;
				}
				i++;
			}
			return true;
		}
		return false;
		
	}
	
	public static int compare(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int i=0;
		int len=s1.length()>s2.length()?s2.length():s1.length();
		while(i<len)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
			i++;
		}
		return s1.length()-s2.length();
	}
	
	public static int str2Integer(String str)
	{
		int i=0,intValue=0;
		while(i<str.length())
		{
			intValue=(str.charAt(i)-'0')+(intValue*10);
			i++;
		}
		return intValue;
	}
	public static String otp(int n)
	{
		int i=0;
		String otpstr="";
		while(i<n)
		{
			otpstr=otpstr+(char)(Math.random()*(123-97)+97);
			i++;
		}
		return otpstr;
	}

}
