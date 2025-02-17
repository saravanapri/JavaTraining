package operators;

public class Evenodd {

	public static void main(String[] args) {
		int num1=36;
		boolean result1=isEven(num1);
		boolean result2=isOdd(num1);
		System.out.println(num1+" is Even number: "+result1+"\n"+num1+" is Odd number: "+result2);
		
		int num2=5;
		result1=isEven(num2);
		result2=isOdd(num2);
		System.out.println(num2+" is Even number: "+result1+"\n"+num2+" is Odd number: "+result2);
	}
	public static boolean isEven(int n)
	{
		boolean res= n%2==0;
		return res;
	}
	public static boolean isOdd(int n)
	{
		boolean res= n%2!=0;
		return res;
	}

}
