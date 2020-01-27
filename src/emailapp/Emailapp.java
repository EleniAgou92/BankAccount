package emailapp;

public class Emailapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1= new Email("elen","agou");
		em1.setAlternateEmail("asas@gmail.com");
		System.out.println(em1.getAlternateEmail());
		em1.showInfo();
		
		
		

	}

}
