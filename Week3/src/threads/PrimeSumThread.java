package threads;

//Calculate the sum of all prime numbers up to a given limit using multiple threads

public class PrimeSumThread {
	 
	public static void main(String[] args) {
		int limit = 10;
		Thread primeSum = new Thread(() -> {
			int result=0;
			for (int i = 2; i < limit; i++) {
				if(isPrime(i))
					result+=i;
			}
			System.out.println(result);
		});
		primeSum.start();
		
	}

	private static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for (int j = 2; j <= Math.sqrt(num); j++) {
			if(num%j==0)
				return false;
		}
		return true;
	}

}
