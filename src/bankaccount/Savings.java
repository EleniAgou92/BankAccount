package bamkaccount;

public class Savings extends Account{

	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	
	public Savings (String name,String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber="1"+accountNumber;
		//System.out.println("ACCOUNT NUMBER"+this.accountNumber);
		//System.out.println("new savvings:");
		setSafetyDepositBox();
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int)(Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey =(int)(Math.random()*Math.pow(10, 4));

	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Savings Account Feature :"
							+"\n BoxID:" +safetyDepositBoxID+
							"\n Key:" +safetyDepositBoxKey);
	}
	public void setRate() {
		rate=getBaseRate() *.25;
	}
}