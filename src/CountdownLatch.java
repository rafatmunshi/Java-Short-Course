import java.util.concurrent.CountDownLatch;

public class CountdownLatch {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 1 done");
				latch.countDown();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 done");
				latch.countDown();
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 3 done");
				latch.countDown();
			}
		}).start();
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All threads completed for the latch and here i begin");
		// do something whatever you want
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread ran once");
			}
		};
		thread.start();
//	try {
//		Thread.sleep(2000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	thread.start();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				System.out.println("Shutdown Hook running");
			}
		});
		System.out.println("Application is terminating...");
	}
}
