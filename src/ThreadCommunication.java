
public class ThreadCommunication {
	static private int balance = 0;
	static private boolean illegalAccess= false;
	synchronized public void withdraw(int amount) {
		if (balance <= 0 || balance < amount) {
			System.out.println("Waiting for balance update");
			try {
				wait(5000);
				if(balance>=amount) {
				balance = balance - amount;
				System.out.println("Amount withdrawn successfully");
				}
			} catch (InterruptedException e) {
				System.out.println("Withdrawal Interrupted");
				return;
			}
			System.out.println("Current balance is "+balance);
		}
		else if(balance>=amount) {
			try {
				wait(5000);
			} catch (InterruptedException e) {
				System.out.println("Withdrawal Interrupted");
				return;
			}
			balance = balance - amount;
			System.out.println("Amount withdrawn successfully");
			}
	}

	synchronized public void deposit(int amount) {
		System.out.println("Depositing amount");
		balance = balance + amount;
		System.out.println("Current balance is "+balance);
		notify();
	}

	public static void main(String[] args) {
		ThreadCommunication bank= new ThreadCommunication();
		Thread withdraw= new Thread(new Runnable() {
			@Override 
			public void run() {
				bank.withdraw(1000);
			}
		});
		withdraw.start();
//		illegalAccess=true;
		if(illegalAccess==true)
			withdraw.interrupt();
		if(withdraw.isInterrupted()){
			System.out.println("Withdrawal Interrupted and could not be completed");
		}
		new Thread(new Runnable() {
			@Override 
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				bank.deposit(2000);
			}
		}).start();
	}

}
