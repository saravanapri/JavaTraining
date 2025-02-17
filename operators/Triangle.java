package operators;

public class Triangle {

	public static void main(String[] args) {
		
		boolean result=isTriangle(30,60,50);
		System.out.println(result);
		
		result=isTriangle(1,1,4);
		System.out.println(result);
		
		result=isTriangle(-1,-6,-7);
		System.out.println(result);

		result=isTriangle(2000000000,2000000000,2000000000);
		System.out.println(result);

	}
	public static boolean isTriangle(int x,int y,int z)
	{
		boolean res = (x>z-y) && (x>y-z) && (y>x-z);
		return res;
	}

}
