package javaset1;

public class Web {

	public static void main(String[] args) 
	{
		int result=webPages(37);
		System.out.println(result);
		
		result=webPages(40);
		System.out.println(result);
	}
	public static int webPages(int n)
	{
		return (n+9)/10;
	}

}
