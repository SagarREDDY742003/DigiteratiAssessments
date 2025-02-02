package finalKeyword;

final class FinalClass {
	// Final variable: Cannot be reassigned
	final int finalVariable = 10;

	// Final method: Cannot be overridden by subclasses
	public void finalMethod() {
		System.out.println(finalVariable);
	}

}