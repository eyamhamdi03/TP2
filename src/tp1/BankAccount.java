
package tp1 ;
import java.util.Scanner;
public class BankAccount {
	

	public int accountNumber ;
	protected String accountHolderName ;
	protected int balance ;
	public BankAccount (int number , String holderName,int balance) 
	{
	accountNumber = number ;
	accountHolderName = holderName ;
	this.balance= balance;	
	}
	public int getAccountNumber()
	{
		return(accountNumber);
	}
	public String getAccountHolderName()
	{
		return(accountHolderName);
	}
	public int getBalance()
	{
		return(balance);
	}
	public void deposit (int amount)
	{
		balance=balance+amount ;
	}

	public void withdraw (int amount )
	{
		if (balance-amount>0)
		{balance = balance-amount;}
		else 
			System.out.println("The balance is not suffisant !");
	}
	public void afficher ()
	{
		System.out.println("the balance of this account ="+balance);
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("account number = ");
		int accountNumber = sc.nextInt();
		System.out.println("account holder name = ");
		sc.nextLine();
		String accountHolderName = sc.nextLine();
		System.out.println("balance = ");
		int balance =sc.nextInt();
		BankAccount Acc1 = new BankAccount(accountNumber,accountHolderName,balance );
		System.out.println("amount to deposit = ");
		int amount = sc.nextInt();
		Acc1.deposit(amount);
		Acc1.afficher();
		System.out.println("amount to withdraw = ");
		int amount1 = sc.nextInt();
		Acc1.withdraw(amount1);
		Acc1.afficher();
		sc.close();
	}
}
