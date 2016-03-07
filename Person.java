package story2;

public class Person {

	String name;
	int age;

	public void speak() {
		System.out.println(name + " was taking a lovely walk down the street.");
		
	}

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Kyle";
		person1.age = 23;

		Person person2 = new Person();
		person2.name = "Tom";
		person2.age = 25;
		
		person1.speak();
		
	}

}