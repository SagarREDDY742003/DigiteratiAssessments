package objectClass;

import java.util.Objects;

public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Override toString method
	@Override
	public String toString() {
		return "User{name='" + name + "', age=" + age + '}';
	}

	// Override equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		User user = (User) obj;
		return age == user.age && name.equals(user.name);
	}

	// Override hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

}