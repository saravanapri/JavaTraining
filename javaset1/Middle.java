package javaset1;

public class Middle {

	public static void main(String[] args) 
	{
		int result=mid(5,10);
		System.out.println(result);
		
		result=mid(6,10);
		System.out.println(result);
	}
	public static int mid(int a,int b)
	{
		return a+(b-a)/2;
	}

}
