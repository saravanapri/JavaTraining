package charprograms;

public class Punctuation {

	public static void main(String[] args) 
	{
		boolean result= isPunctuate('*');
		System.out.println(result);
		
		result= isPunctuate('&');
		System.out.println(result);
		
		result= isPunctuate('A');
		System.out.println(result);
		
		result= isPunctuate('Z');
		System.out.println(result);
		
		result= isPunctuate('a');
		System.out.println(result);
		
		result= isPunctuate('s');
		System.out.println(result);
		
		result= isPunctuate('z');
		System.out.println(result);
		
		result= isPunctuate('5');
		System.out.println(result);

	}
	public static boolean isPunctuate(char ch)
	{
		return (ch<65 || ch>90) && (ch<97 || ch>122) && (ch<48 || ch> 57);
		
	}

}
