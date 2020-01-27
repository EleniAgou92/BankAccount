package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private int defaultPasswordLength=10;
	private String deparment;
	private int mailBoxCapacity;
	private String companySuffix="nameofcompany.com";
	private String alternateEmail;
	
	public Email(String firstname, String lastname) {
		this.firstname= firstname;
		this.lastname= lastname;
		System.out.println("Email created:" +this.firstname +" " +this.lastname);
		
		//call method asking for deparmnet
		this.deparment= setDeparment();
		System.out.println("Deparment:" +this.deparment);
		
		//call a method return a random password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your password:" +this.password);
		
		//email
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+ deparment+"." + companySuffix;
		System.out.println("Your email:" +email);
	
		
	}

	private String setDeparment() {
		System.out.println("Set department code:\n 1 for sales,\n 2 for development,\n3 for accounting\n0 for none");
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) { return ("sales");}
		else if(depChoice==2) { return ("dev");}
		else if(depChoice==3) {return ("account");}
		
		else {return "";}
		
	}

	private String randomPassword(int length) {
		String passwordSet="ADEDgerhseE@$4adghj464ASASadA";
		char[] password1=new char[length];
		for (int i=0; i<length ; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password1[i]=passwordSet.charAt(rand);
			}
		return new String(password1);
	}

	//show info
	  public String showInfo(){
	        return "DISPLAY NAME: " +firstname + " " + lastname + "\nCOMPANY EMAIL: " +email + "\nMAILBOX CAPACITY: "
	                +mailBoxCapacity + "mb";
	    }

	//set mail capacity
	  public void setMailBoxCapacity(int capacity) {
	        this.mailBoxCapacity = capacity;
	   }
	//set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password; }
}
 