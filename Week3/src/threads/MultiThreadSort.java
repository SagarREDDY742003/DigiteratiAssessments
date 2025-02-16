package threads;

import java.util.Arrays;

//Sort an array of integers using multiple threads
public class MultiThreadSort {

	public static void main(String[] args) {
		int[] arr = {5,2,9,1,5,6,0,3};
		int mid = arr.length/2;
		
		Thread thread1 = new Thread(() -> Arrays.sort(arr,0,mid));
		Thread thread2 = new Thread(() -> Arrays.sort(arr,mid,arr.length));
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Arrays.sort(arr);
		System.out.println("sorted array"+ Arrays.toString(arr));

	}

}
