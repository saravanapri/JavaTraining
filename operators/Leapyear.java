package operators;

public class Leapyear {

	public static void main(String[] args) 
	{
		int year=1500;
		boolean result= isLeapYear(year);
		System.out.println(year + " is a leap year : "+result);
		year=1600;
		result= isLeapYear(year);
		System.out.println(year + " is a leap year : "+result);
		year=2013;
		result= isLeapYear(year);
		System.out.println(year + " is a leap year : "+result);
		year=2012;
		result= isLeapYear(year);
		System.out.println(year + " is a leap year : "+result);
	}
	public static boolean isLeapYear(int year)
	{
		boolean res=(year%4==0 && year%100!=0 )||( year%400==0);
		return res;
	}

}
