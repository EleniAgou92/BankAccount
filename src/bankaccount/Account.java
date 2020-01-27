package bamkaccount;

public abstract class Account implements IBaseRate{

	private String name;
	private String	sSN;
	private double balance;
	
	static int index=10000;
	
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties and initialise the account
	public Account(String name, String sSN, double initDeposit) {
	
		this.name =name;
		this.sSN=sSN;
		balance=initDeposit;
		
		
		//System.out.println("name:" +name +"sSN:"+sSN+"BALANCE"+balance);
		index++;
		this.accountNumber= setAccountNumber();
		
		//System.out.println("AccountNumber:"+this.accountNumber);
		//System.out.println(getBaseRate());
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOffSSN= sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID=index;
		int randomNumber =(int) (Math.random() * Math.pow(10, 3));
		return lastTwoOffSSN+uniqueID+randomNumber;
	}	
	
	public void compound() {
		double accrueInterest = balance*(rate/100);
		balance=balance+accrueInterest;

		System.out.println("accured interest:"+accrueInterest );
		printBalance();
	}
	//list common methods
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposit $"+amount);
		printBalance();
		
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdraw $"+amount);
		printBalance();

	}
	
	public void transfer(String toWhere, double amount) {
		balance=balance-amount;
		System.out.println("Transfering: "+amount +"to"+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is: "+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"name:"+name+
				"\nACCOUNT NUMER:"+accountNumber+
				"\nBALANCE:"+balance
				+"\n RATE" + rate+ "%");
	}
}
