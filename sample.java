package GoogleInterviewPractice;

import java.util.*;


class sample{
	
		
	public String reverseString(String input)
	{
		
		String output = "";
		
		System.out.println(input.length());
		
		for(int i = input.length()-1;i>=0;i--)
		{
			
			output = output + input.charAt(i);
			
		}

		return output;
	}
	
	
	public String inttoStringConvert(int input)
	{
		
		
		
		
		
		return "";
	
	}
	
	
	public int stringToInt(String input)
	{
		
		int number = 0;
		
		
		for(int i=0;i<input.length();i++)
		{
			
				
			char c = input.charAt(i);
			
			if(c != '-')
			{
				System.out.println("character :"+c);
				
				number = number * 10 + (int) c;
				
				System.out.println("number :"+number);
			}
		
	
		}
		
		
		return number;
		
	}
	
	
	
	  public char finduniqueCharacter(String input)
	  {
		  
		  ArrayList<Character> storeunique = new ArrayList<Character>();
		  
		  
		  for(int i=0;i<input.length();i++)
		  {
			  
			  char frominput = input.charAt(i);
			  
			  if(storeunique.contains(frominput))
			  {
				  
				  System.out.println(storeunique);
				  
				  storeunique.remove(storeunique.indexOf(frominput));
			  }
			  else
			  {
				  storeunique.add(frominput);
			  }
			  
			  
		  }
		  
  
		return storeunique.get(0);
		  
	  }
	  
	  
	  public String removeChars(String input,String remove)
	  {
		  
		  
		  ArrayList<Character> output = new ArrayList<Character>();
		  
		 
		 for(int i=0;i<remove.length();i++)
		 {
			 
			 char c = remove.charAt(0);
			 
			 
			for(int k=0;k<input.length();k++)
			{
				
				if(input.charAt(k) == c)
				{
					
					input.replace(input.charAt(k),' ');
					
					if(output.contains(c))
					{
						
						output.remove(output.indexOf(input.charAt(k)));
					}
					
					
				}
				else
				{
					
					if(output.contains(input.charAt(k)))
					{
						
					}
					else
					{
						
												
						output.add(input.charAt(k));
						
						
					}
					
   
				}
				
			}
	 			 
		 }
		 
		 
		String finalstring = "";
		
		for(int u=0;u<output.size();u++)
		{
			
		
				finalstring = finalstring + output.get(u);
	
		}

		  
		return finalstring;
		  
	  }
	
	
	
	
	
	
		public static void main(String args[])
		{
			
			Scanner o = new Scanner(System.in);
			
			System.out.println("out :"+(1/2));
			
			
			System.out.println("Enter the input String");
			
			String input = o.nextLine();
			
		//	System.out.println("Reverse String :"+new sample().reverseString(input));
			
			System.out.println("String to integer :"+new sample().stringToInt(input));
			
		//	System.out.println("output :"+new sample().removeChars(input,"hrv"));
			
			
		//	System.out.println("First unrepeated charachter is :"+new sample().finduniqueCharacter(input));
			
		}
}