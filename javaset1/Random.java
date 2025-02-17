package javaset1;

public class Random {

	public static void main(String[] args) 
	{
		  int result= randInt(1,7);
		  System.out.println(result);

		  result= randInt(200,100);
		  System.out.println(result);

	}
	public static int randInt(int a, int b)
	{
		double res= Math.random() * (b-a) + a;
		return (int)res;
	}

}
