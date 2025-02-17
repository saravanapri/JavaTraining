package nested;

public class SubString {

	public static void main(String[] args) 
	{
		System.out.println(findSubString("program","gram"));
		
		System.out.println(findSubString("gram","program"));
		
		System.out.println(findSubString("gram","gram"));
		
		System.out.println(findSubString("java","program"));
		
		System.out.println(findSubString("appandapple","apple"));

	}
	public static int findSubString(String s1,String s2)
	{
		int i=0,flag;
		
		while(i<s1.length() && s1.length()>=s2.length())
		{
			int j=0;flag=i;
			
			while(j<s2.length() && s1.charAt(flag)==s2.charAt(j))
			{
				flag++;
				j++;	
			}
			
			if(j==s2.length())
			{
				return i;
			}
			
			i++;
		}
		return -1;
	}

}
