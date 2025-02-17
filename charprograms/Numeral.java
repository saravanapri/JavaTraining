package charprograms;

public class Numeral {

	public static void main(String[] args) 
	{
		boolean result=isNumeric('0');
		System.out.println(result);

		result=isNumeric('9');
		System.out.println(result);

		result=isNumeric('B');
		System.out.println(result);
		
		result=isNumeric('*');
		System.out.println(result);

		result=isNumeric('a');
		System.out.println(result);

	}
	public static boolean isNumeric(char ch)
	{
		boolean res = ch>=48 && ch<= 57;
		return res;
	}

}
