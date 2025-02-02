package finalKeyword;

public class FinalKeywordDemo {
	public static void main(String[] args) {
		FinalClass finalClassObj = new FinalClass();
		finalClassObj.finalMethod();
		System.out.println("Final variable in FinalClass: " + finalClassObj.finalVariable);

		SubClass subClassObj = new SubClass();
		subClassObj.finalMethod();
		subClassObj.display();
		System.out.println("Final variable in SubClass: " + subClassObj.finalVariable);
	}
}
