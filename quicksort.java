
public class quicksort {

	
	public int partition(int array[],int left,int right)
	{
		
		assert array.length>=0 && Integer.valueOf(left)!=null && Integer.valueOf(right)!=null;
		
		
		int pivot = array[(left+right)/2];
		
		int temp;
		
		while(left <= right)
		{
			
			assert array.length>=0 && Integer.valueOf(left)!=null && Integer.valueOf(right)!=null && left<=right;
			
			while(array[left] < pivot)
			{
				
				assert array[left] < pivot;
				
				left++;
			}
			
			while(array[right] > pivot)
			{
				
				assert array[right] > pivot;
				
				right--;
			}
			
			
			if(left <= right)
			{
				
				assert left <= right;
				
				temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left++;
				right--;
			}
	
		}

		 
		
		assert Integer.valueOf(left) != null;
		
		return left;
		
	}
	
	
	public void Quicksort(int array[],int startindex,int endindex)
	{
	
		assert array.length>=0 && Integer.valueOf(startindex)!=null && Integer.valueOf(endindex)!=null;
		
		int partitionindex = partition(array, startindex, endindex);
		
		if(startindex < partitionindex-1)
		{
			assert array.length>=0 && Integer.valueOf(startindex)!=null && Integer.valueOf(partitionindex)!=null;
			
			Quicksort(array, startindex, partitionindex-1);
		}
		if(endindex > partitionindex)
		{
			
			assert array.length>=0 && Integer.valueOf(endindex)!=null && Integer.valueOf(partitionindex)!=null;
			
			Quicksort(array, partitionindex, endindex);
		}
		
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
	
		int array[] = new int[]{2,5,3,4,9,8,1};
		
		
		new quicksort().Quicksort(array, 0, array.length-1);
		
		for(int l=0;l<array.length;l++)
		{
			System.out.println(array[l]);
		}
		
	}
	
	
	
}
