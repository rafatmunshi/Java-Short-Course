
public class ThreadSynchronisation {
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					w1.generateString();
			}

		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++)
					w2.generateString();
			}

		}).start();
	}
}

class Worker {
	private Object lock = "lock";
//	synchronized public static void generateString() {
	public void generateString() {
		synchronized (lock) {
			for (int i = 0; i < 10; i++) {
				if (i < 5)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println(" ");
		}
		// All other code which doesnt need to be synchronised
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
