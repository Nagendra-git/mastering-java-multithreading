package multithreading;

/**
 * Demonstrates creating a thread by extending the {@code Thread} class.
 * 
 * <p>To create a custom Thread:
 * <ul>
 * 	<li>Extend the {@code Thread} class.</li>
 *  <li>Override the {@code run()} method to define the task to be executed.</li>
 *  <li>Create an instance of the subclass and invoke the {@code start()} method.</li>
 * </ul>
 * 
 * <p>Calling {@code start()} creates a new thread and internally invokes the 
 * {@code run()} method.Calling {@code run()} directly does not create a new thread;
 * it executes the method in the current thread.
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
	}

}
