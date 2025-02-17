package nested;

import java.util.Arrays;

import arrayprob.ArrayPrint;
import stringset.StringCompare;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]= {11, 25, 12, 22, 9};
		selection(a);
		System.out.println(Arrays.toString(a));
		
		insertion(a);
		System.out.println(Arrays.toString(a));
		
		String[] str= {"apple","apply","application","ant","allow"};
		sort(str);
		int i=0;
		while(i<str.length)
		{
			System.out.print(str[i]+" ");
			i++;
		}

	}

	
	public static void selection(int[] a)
	{
		int i=0,temp;
		
		while(i<a.length)
		{
			int smallPos=i,j=i+1;
			
			while(j<a.length)
			{
				if(a[j]<a[smallPos])
				{
					smallPos=j;
				}
				j++;
			}
			
			temp=a[i];
			a[i]=a[smallPos];
			a[smallPos]=temp;
			
			i++;
		}
	}
	
	public static void insertion(int[] a)
	{
		int i=1;
		int check;
		
		while(i<a.length)
		{
			check=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>check)
			{
				a[j+1]=a[j];
				j--;
			}
			
			a[j+1]=check;
			i++;
		}
	}
	
	public static void sort(String s[])
	{
		int i=0;
		while(i<s.length)
		{
			int j=i+1;
			while(j<s.length)
			{
				if(s[i].compareTo(s[j])>=0)
				{
					String temp=s[j];
					s[j]=s[i];
					s[i]=temp;
				}
				j++;
			}
			i++;
		}
	}

}
