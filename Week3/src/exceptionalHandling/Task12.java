package exceptionalHandling;

public class Task12 {

	public static void main(String[] args) {
		
		//Throw an exception and catch it using a try-catch block
		try{
			throw new Exception("This is an Exception");
		}catch(Exception e) {
			System.out.println("Caught exception: "+e.getMessage());
		}
		
		//Throw an exception and catch it using a try-catch block
		try{
			@SuppressWarnings("unused")
			int num =4;
			num/=0;
		}catch(Exception e) {
			System.out.println("Caught exception: "+e.getMessage());
		}
		
	}

}
