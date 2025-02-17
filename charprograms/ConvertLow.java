package charprograms;

public class ConvertLow {

	public static void main(String[] args) 
	{
		char result = toLower('A');
		System.out.println(result);

		result = toLower('Z');
		System.out.println(result);

		result = toLower('a');
		System.out.println(result);

		result = toLower('*');
		System.out.println(result);

		result = toLower('0');
		System.out.println(result);

	}
	public static char toLower(char ch)
	{
		if(ch>=65 && ch <=90)
		{
			int res= ch+32;
			return (char) res;
		}
		else
		{
			return ch;
		}
	}

}
