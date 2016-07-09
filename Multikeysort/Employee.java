package Multikeysort;

public class Employee {

	public String surname;
	public String givenname;
	
	
	public boolean checkClassinvariant(Employee employee)
	{
		
		
		return surname!=null && givenname != null;
		
	}
	

	public Employee(String surname, String givenname) {
		super();
		this.surname = surname;
		this.givenname = givenname;
		
		checkClassinvariant(this);
	}

	public String getSurname() {
		checkClassinvariant(this);
		return surname;
	}

	public void setSurname(String surname) {
		
		checkClassinvariant(this);
		
		this.surname = surname;
	}

	public String getGivenname() {
		checkClassinvariant(this);
		return givenname;
	}

	public void setGivenname(String givenname) {
		checkClassinvariant(this);
		this.givenname = givenname;
	}

}
