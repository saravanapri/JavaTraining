package stringset;

public class Sequence {

	public static void main(String[] args) 
	{
		boolean result=subsequence("abcdafgh","adgh");
		System.out.println(result);
		
		result=subsequence("abcdafgh","cagb");
		System.out.println(result);
		
		result=subsequence("cagb","cagb");
		System.out.println(result);
		
		result=subsequence("cagb","cagbfg");
		System.out.println(result);

	}
	public static boolean subsequence(String s1,String s2)
	{
		if(s1.length()>=s2.length())
		{
			int i=0,j=0;
			while(i<s1.length())
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					j++;
				}
				if(j==s2.length()) 
				{
					return true;
				}
				i++;
			}
		}
		return false;
	}

}
