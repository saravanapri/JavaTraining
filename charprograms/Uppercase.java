package charprograms;

public class Uppercase {

	public static void main(String[] args) 
	{
		boolean result= isUpper('A');
		System.out.println(result);
	 
		result= isUpper('Z');
		System.out.println(result);
	 
		result= isUpper('S');
		System.out.println(result);
		
		result= isUpper('a');
		System.out.println(result);
	 
		result= isUpper('z');
		System.out.println(result);
		
		result= isUpper('*');
		System.out.println(result);
	    

	}
	public static boolean isUpper(char ch)
	{
		boolean res = ch>=65 && ch<=90;
		return res;
	}

}
