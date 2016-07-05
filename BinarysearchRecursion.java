package GoogleInterviewPractice;

import java.util.Arrays;
import java.util.Scanner;
import org.junit.Assert;

public class BinarysearchRecursion {
	
	
	public static boolean checkSortedArray(int b[])
	{
		
		for(int i=0;i<b.length;i++)
		{
			if(i!=b.length-1)
			{
				if(b[i] > b[i+1])
				{
					return false;
				}
				
			}
		}
		
		
		return true;
	}
	
	public static boolean checkElementsArray(int c[],int key)
	{
		
		for(int k=0;k<c.length;k++)
		{
			if(c[k] == key)
			{
				return false;
			}
		}
		
		
		return true;
	}
	
	
	 public static int indexOf(int[] a, int key) {
		 
		 assert checkSortedArray(a) && Integer.toString(key)!=null;
		 
	        int lo = 0;
	        int hi = a.length - 1;
	        
	        assert Integer.toString(lo)!= null && Integer.toString(hi)!=null && lo<=hi;
	        
	        while (lo <= hi) {
	        	
	        	assert Integer.toString(lo)!= null && Integer.toString(hi)!=null && lo<=hi;
	            // Key is in a[lo..hi] or not present.
	            int mid = lo + (hi - lo) / 2;
	            if      (key < a[mid]) hi = mid - 1;
	            else if (key > a[mid]) lo = mid + 1;
	            else assert mid!=-1 && Integer.toString(mid)!=null; return mid;
	            
	        }
	        assert checkElementsArray(a, key);
	        return -1;
	    }
	
	public static void main(String args[])
	{
		
		Scanner o = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		
		int arrayinputsize = o.nextInt();
		
		System.out.println("Enter the sorted array elements :");
		
		int a[] = new int[arrayinputsize];
		
		for(int i=0;i<arrayinputsize;i++)
		{
			
			a[i] = o.nextInt();
			
			
		}
		
		System.out.println("Enter the element you want to search :");
		
		int element = o.nextInt();
		
		System.out.println("Search the element from an array :"+BinarysearchRecursion.indexOf(a,element));
		
	}
	

}
