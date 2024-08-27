package ver2;

public class Account {

	// Instance variable, only available inside this class.

	private double balance;
	

	// Constructor

	public Account(double initBalance) {

	balance = initBalance;
	
	

	}
	//new comment
	

	Account a1 = new Account(1000.0);

	System.out.println("Balance=$" + a1.getBalance());

	a1.deposit(500.0);

	System.out.println("Balance=$" + a1.getBalance());
	
	// Decreases the balance by amount

		public void withdraw(double amount) {

		if(amount>0) {

		balance -= amount;
		
		a1.withdraw(200.0);

		System.out.println("Balance=$" + a1.getBalance());

		}
		@Override

		public String toString() {

		String msg = "balance=$" + balance;

		return msg;
		
		System.out.println(a1.toString());

		System.out.println(a1);

		}
		public static void main(String[] args) {

			Account a1 = new Account(1000.0);

			System.out.println("Balance=$" + a1.getBalance());

			a1.deposit(500.0);

			System.out.println("Balance=$" + a1.getBalance());

			a1.withdraw(200.0);

			System.out.println("Balance=$" + a1.getBalance());

			System.out.println(a1.toString());

			System.out.println(a1);

			}
	
	}
		

	}