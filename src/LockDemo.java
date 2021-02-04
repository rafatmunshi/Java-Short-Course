import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	static int count = 0;
	static int balance = 0;
	static Lock lock = new ReentrantLock();
	static Lock lock2 = new ReentrantLock();
//	static String lock1 = "lock1";
//	static String lock2 = "lock2";

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				lock.lock();
//				try {
//					if(!lock.tryLock(2000, TimeUnit.MILLISECONDS))
//						Thread.yield();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				try {
//					synchronized (lock1) {
					for (int i = 0; i < 10; i++) {
						count++;
						System.out.println("Count is " + count);
					}

					lock2.lock();
//						synchronized (lock2) {
					balance = balance + count;
//						}
//					}
				} finally {
					lock2.unlock();
					lock.unlock();
				}
				
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {

//				synchronized (lock2) {
//					synchronized (lock1) {
				lock2.lock();
				balance = balance + count;
				lock.lock();
//					}
				try {
					for (int i = 0; i < 10; i++) {
						count++;
						System.out.println("Count is " + count);
					}
				} finally {
					lock.unlock();
					lock2.unlock();
				}
				
			}
//			}
		});
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println("Count is " + count);
//		System.out.println("Balance is " + balance);
	}
}
