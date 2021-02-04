import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
public static void main(String[] args) {
	Runnable r1= new Task("r1");
	Runnable r2= new Task("r2");
	Runnable r3= new Task("r3");
	Runnable r4= new Task("r4");
	Runnable r5= new Task("r5");
	Runnable r6= new Task("r6");
	Runnable r7= new Task("r7");
	
	ExecutorService pool= Executors.newFixedThreadPool(3);
	pool.execute(r1);
	pool.execute(r2);
	pool.execute(r3);
	pool.execute(r4);
	pool.execute(r5);
	pool.execute(r6);
	pool.execute(r7);
	
	pool.shutdown();
}
}
 class Task implements Runnable{
	 String taskName;
	 public Task(String taskName) {
		super();
		this.taskName = taskName;
	}
	public void run() {
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(taskName+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getName());
	 }
 }