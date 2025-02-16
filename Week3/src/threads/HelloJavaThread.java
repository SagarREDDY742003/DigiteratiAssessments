package threads;
//Basic Java thread that prints "Hello, Java!"
public class HelloJavaThread extends Thread{
	
	public void start() {
		System.out.println("Hello, Java!");
	}
	public static void main(String[] args) {
		HelloJavaThread hjt = new HelloJavaThread();
		hjt.start();
	}
}
