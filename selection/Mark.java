package selection;

public class Mark {

	public static void main(String[] args) 
	{
        int result=grade(98);
        System.out.println(result);
        
        result=grade(8);
        System.out.println(result);
        
        result=grade(70);
        System.out.println(result);
        
        result=grade(88);
        System.out.println(result);
        
        result=grade(67);
        System.out.println(result);
        
        result=grade(55);
        System.out.println(result);
        
        result=grade(75);
        System.out.println(result);
        
        result=grade(-1);
        System.out.println(result);
	}
	public static int grade(int m)
	{
		int res=0;
		if(m<50)
		{
			res=0;
		}
		else if(m>=90)
		{
			res=1;
		}
		else if(m<90 && m>=80)
		{
			res=2;
		}
		else if(m<80 && m>=70)
		{
			res=3;
		}
		else if(m<70 && m>=50)
		{
			res=4;
		}
		return res;
	}

}
