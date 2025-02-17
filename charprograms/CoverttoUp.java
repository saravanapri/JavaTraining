package charprograms;

public class CoverttoUp {

	public static void main(String[] args) 
	{
		char result= toUpper('a');
		System.out.println(result);
				
		result= toUpper('z');
		System.out.println(result);
				
		result= toUpper('A');
		System.out.println(result);
				
		result= toUpper('9');
		System.out.println(result);
				
		result= toUpper('%');
		System.out.println(result);
				

	}
	public static char toUpper(char ch)
	{
		if(ch>=97 && ch <=122)
		{
			int res = ch-32;
			return (char) res;
		}
		else
		{
			return ch;
		}
	}

}
