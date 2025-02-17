package javaset1;

public class AtmCoin {

	public static void main(String[] args) 
	{
		atm45(13);
		atm45(17);
		atm45(20);
	}
	public static void atm45(int amount)
	{
		int five=amount%4;
		int four=(amount-(five*5))/4;
		System.out.println("5 :"+five+"\n4 :"+four);
	}

}
