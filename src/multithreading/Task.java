package multithreading;

/**
 * Demonstrates creating a thread by implementing the {@code Runnable} interface.
 * 
 * <p>To create a custom thread:
 * <ul>
 * 	<li>Extend the {@code Runnable} class.</li>
 *  <li>Override the {@code run()} method to define the task to be executed.</li>
 *  <li>Create an instance of the subclass and invoke the {@code start()} method.</li>
 * </ul> 
 * <p>Calling {@code start()} creates a new thread and internally invokes the 
 * {@code run()} method.
 */
public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Task running ......");
	}
	public static void main(String[] args) {
		Thread t =new Thread(new Task());
		t.start();
	}

}
