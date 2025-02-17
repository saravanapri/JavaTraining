package charprograms;

public class Alphabet {

	public static void main(String[] args) 
	{
		boolean result=isAlphabet('A');
		System.out.println(result);

		result=isAlphabet('Z');
		System.out.println(result);

		result=isAlphabet('a');
		System.out.println(result);

		result=isAlphabet('z');
		System.out.println(result);

		result=isAlphabet('s');
		System.out.println(result);
		
		result=isAlphabet('0');
		System.out.println(result);
		
		result=isAlphabet('*');
		System.out.println(result);
	
	}
	public static boolean isAlphabet(char ch)
	{
		boolean res = ch>=65 && ch<=90 || ch>=97 &&  ch<=122;
		return res;
		
	}

}
