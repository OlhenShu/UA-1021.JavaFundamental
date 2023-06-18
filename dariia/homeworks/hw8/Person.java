package hw8;

public abstract class Person implements Cloneable {
	private int age;
	FullName fullName;

	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.setAge(age);
	}

	protected int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String info() {
		return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: "
				+ this.age;
	}

	abstract String activity();

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person copyOfPerson = (Person) super.clone();
		copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
		return copyOfPerson;
	}

}
