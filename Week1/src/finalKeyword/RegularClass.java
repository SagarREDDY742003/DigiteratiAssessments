package finalKeyword;

//Regular class
class RegularClass {
	final int finalVariable = 20;

	// Final method: Cannot be overridden by subclasses
	final void finalMethod() {
		System.out.println(finalVariable);
	}
}