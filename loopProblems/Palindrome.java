package loopProblems;

public class Palindrome {

	public static void main(String[] args) 
	{
		boolean result= isPalindrome(1331);
		System.out.println(result);
		
		result= isPalindrome(25);
		System.out.println(result);
		
		result= isPalindrome(202);
	    System.out.println(result);
		
	}
	public static boolean isPalindrome(int n)
	{
		int rev=Reverse.reverse(n);
		return n==rev;
	}

}
