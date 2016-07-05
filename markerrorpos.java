import java.util.ArrayList;

public class markerrorpos {
	
	
	// this is for input text length
	int inputlength = 0;

	/*
	 * 
	 * markErrorPos is a recursive function 
	 * that take input text and position list
	 * 
	 * 
	 */
	
	public String markErrorPos(String text,ArrayList<Integer> pos)
	{
		// pre condition
		assert text.length()>0 && pos != null && Integer.toString(inputlength)!=null;
		
		
		if(inputlength==0)
		{
			// length of the input
			inputlength = text.length();
			
			text = "";
		}
				
		/*
		 *  check the size of the position array
		 *  just generate an output string with '^'
		 */
		
		if(pos.size()>0)
		{
			for(int i=text.length()+1;i<=pos.get(0);i++)
			{
				// Loop Invariant
				assert text.length()>=0 &&  i<=pos.get(0) && pos.size()>0;
				
				if(i==pos.get(0))
				{
					text = text + "^";
				}
				else
				{
					text = text + " ";
				}
				
				
			}
			
			
			pos.remove(0);
			
			// post condition
			assert text.length()>0 && pos!=null;
			
			return markErrorPos(text,pos);
		}
		else
		{
			/*
			 * this loop is for extend output String with space upto length of an input String
			 */
			
			for(int j=text.length()+1;j<=inputlength;j++)
			{
				text = text + " ";
			}
			
			// post condition
			assert text.length()>0;
			
			return text;
		}
			
		
		
	}
	
	
	public static void main(String args[])
	{
		
		String input = "dhruv";
		
		ArrayList<Integer> position = new ArrayList<Integer>();
		
		position.add(2);
		position.add(4);

		
		System.out.println(input);
		
		System.out.println(new markerrorpos().markErrorPos(input, position));
		
	}
	
	
	

}
