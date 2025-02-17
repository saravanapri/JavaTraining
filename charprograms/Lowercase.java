package charprograms;

public class Lowercase {

	public static void main(String[] args) 
	{
		boolean result=isLower('a');
		System.out.println(result);
			
		result=isLower('z');
		System.out.println(result);
			
		result=isLower('A');
		System.out.println(result);
			
		result=isLower('*');
		System.out.println(result);
			

	}
	public static boolean isLower(char ch)
	{
		boolean res = ch >= 97 && ch <= 122;
		return res;
		
	}
	

}
