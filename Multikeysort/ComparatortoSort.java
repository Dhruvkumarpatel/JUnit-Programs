package Multikeysort;

import java.util.Comparator;

public class ComparatortoSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		assert o1!=null && o2 != null;
		
		int value = o1.surname.compareToIgnoreCase(o2.surname);
		
		if(value == 0)
		{
			value = o1.givenname.compareToIgnoreCase(o2.givenname);
		}
		
		assert value==0 || value > 0 || value <0;
		
		return value;
	}
	

}
