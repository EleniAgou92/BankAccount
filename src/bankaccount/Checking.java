package bamkaccount;

public class Checking  extends Account{

	//list
	private int debitCardNumber;
	private int debitCardPIN;
	
		//constructor to initialize check account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="2"+accountNumber;

		//System.out.println("NEW CHECKING ACCOUNT");
		//System.out.println("NAME:"+name);
		//System.out.println("ACCOUNT NUMBER" + this.accountNumber);
		setDebitCard();
	}
	public void setRate() {
		rate=getBaseRate() *.15;
	}
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN=(int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT Cheking feature"
				+ "\n NumerDebitCard:"+debitCardNumber
				+"\n PIN" +debitCardPIN);
	}
	
}
