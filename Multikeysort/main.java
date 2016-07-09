package Multikeysort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class main {
	
			public static void main(String args[])
			{
				
					ArrayList<Employee> objects = new ArrayList<Employee>();
				
			
					
					objects.add(new Employee("patel","dhruv"));
					objects.add(new Employee("faldu", "vishal"));
					objects.add(new Employee("faldu","mitesh"));
					objects.add(new Employee("jaimini","utkarshani"));
					
					
					
					
				 objects.sort(new ComparatortoSort());
				 
				 for(int i=0;i<objects.size();i++)
				 {
					 
					 assert objects.size()>0 && i <objects.size();
					 
					 System.out.println("surname :"+objects.get(i).getSurname()+","+" Givenname :"+objects.get(i).getGivenname());
				 }
					
					
			}

}
