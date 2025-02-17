package javaset1;

public class LinearMap {

	public static void main(String[] args) 
	{
        double result=linearMap(1,10,101,200,1);
        System.out.println(result);
        
        result=linearMap(1,10,101,200,2);
        System.out.println(result);
        
        result=linearMap(1,10, 101,200,5);
        System.out.println(result);
        
        result=linearMap(1,10,101,200,10);
        System.out.println(result);
        
        result=linearMap(101,200,1,10, 120);
        System.out.println(result);
        
        result=linearMap(1,10,101,200,1.5);
        System.out.println(result);
        
	}
	public static double linearMap(int a1,int a2,int b1,int b2,double value)
	{
		double norm =(double) (value-a1)/(a2-a1);
		double result=(double) (norm*(b2-b1))+b1;
		return result;
		
	}

}
