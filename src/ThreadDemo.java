
public class ThreadDemo extends Thread {
	// public class ThreadDemo implements Runnable{
	public ThreadDemo(String string) {
		super(string);
	}

	public void run() {
//		System.out.println(System.nanoTime()); 
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getId() + " " + this.getName());
		}
	}

	public static void main(String[] args) {
//		System.out.println(System.nanoTime());
		ThreadDemo t1 = new ThreadDemo("Thread 1");
		ThreadDemo2 t2 = new ThreadDemo2("Thread 2");
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread 1 completed");
		t2.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous thread running");
			}
		}).start();
//	Thread thread1= new Thread(t1, "Thread 1");
//	thread1.start();
//	Thread thread2= new Thread(t2, "Thread 2");
//	thread2.start();
//	func1();
//	func2();
	}

//	private static void func1() {
//		System.out.println(System.nanoTime());
//	}
//
//	private static void func2() {
//		System.out.println(System.nanoTime());
//	}
}
class ThreadDemo2 extends Thread{
	public ThreadDemo2(String string) {
		super(string);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getId() + " " + this.getName());
		}
	}
}
