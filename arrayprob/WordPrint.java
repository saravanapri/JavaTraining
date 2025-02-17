package arrayprob;

import stringset.StringCompare;

public class WordPrint {

	public static void main(String[] args) 
	{
		numToWord(0);
		numToWord(4);
		numToWord(44);
		numToWord(14);
		numToWord(50);
		numToWord(99);
		numToWord(96);
		numToWord(10);
		numToWord(15);
		numToWord(20);

	}
	public static void numToWord(int num)
	{
		String ones[]= {"zero","one","Two","Three","four","five","six","seven","eight","nine","Ten","Eleven","Twelve","Thirteen","fourteen","fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens2[]= {"twenty","Thirty","Forty","fifty","Sixty","seventy","Eighty","ninety","Hundred"};
		
		if(num<=19 )
		{
			System.out.println(ones[num]);
				
		}
		else if(num%10 !=0)
		{
			System.out.println(tens2[num/10 -2] +" "+ones[num%10]);
		}
		else
		{
			System.out.println(tens2[num/10 -2]);
		}

					
		
		
	}

}
