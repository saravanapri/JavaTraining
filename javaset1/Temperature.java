package javaset1;

public class Temperature {

	public static void main(String[] args) 
	{
		double result=c2f(37);
		System.out.println(result);

	}
	public static double c2f(int c)
	{
		return c*9.0/5.0+32;
	}

}
