package finalKeyword;

class SubClass extends RegularClass {
	// Overriding finalMethod will result in a compilation error

	void display() {
		System.out.println("Subclass can access the final variable: " + finalVariable);

	}
}