package com.javahongkong.bootcamp.exercise;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;
	//private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		super(idNumber);
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getFirstName() {
		// complete the function
		return this.firstName;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
	}

	public boolean equals(Object o){
		if(o==this){
			return true;
		} else if(!(o instanceof Person)){
			return false;
		}
		Person person = (Person) o;
		return person.firstName.equals(this.firstName)
		&& person.lastName.equals(this.lastName)
		&& person.getIdNumber()==this.getIdNumber();
}

}
