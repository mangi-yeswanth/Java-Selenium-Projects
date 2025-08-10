package pkg_threadappli2;

class BankAccount {
	private int account_balance = 1000; // Initial balance

	public synchronized void withdraw_amt(int amount) {
		if (account_balance - amount > 0) {
			account_balance = account_balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
			System.out.println("Balance Amount: " + account_balance);
		} else {
			System.out.println("Insufficient Balance in your account enter less amount than " + account_balance);
		}
	}

	public int getBalance() {
		return account_balance;
	}
}

public class BankTransaction {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();

		Thread t1 = new Thread(() -> {
			bankAccount.withdraw_amt(100);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			bankAccount.withdraw_amt(600);
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Balance Left: " + bankAccount.getBalance());
	}
}