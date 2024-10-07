package project;

public abstract class Person {
	String name;
	String personId;
	public Person(String name, String personId) {
        this.name = name;
        this.personId = personId;
    }
	public abstract void displayDetails();
}
