package javaset1;

public class Atm {

	public static void main(String[] args) 
	{
		atm(2500);

	}
	public static void atm(int amount)
	{
		int twothousand=amount/2000;
		amount=amount%2000;
		int fivehund=amount/500;
		amount=amount%500;
		int hund=amount/100;
		System.out.println("2000 : "+twothousand+"\n500: "+fivehund+"\n100 : "+ hund);
	}

}
