package studentdatabaseapp;

import java.util.Scanner;

public class Student {

		private String firstname;
		private String lastname;
		private int gradeYear;
		private String studentID;
		private String courses= "";
		private int tuitionBalance=0;
		private int costOfCourse=600;
		public static int id=1000;
		
		public Student() {
			Scanner in = new Scanner(System.in);
			System.out.println("Name:");
			this.firstname= in.nextLine();
			
			System.out.println("lastname");
			this.lastname= in.nextLine();
			
			System.out.println("1 for junior\n2 for senior:");
			this.gradeYear=in.nextInt();
			
			System.out.println(firstname + "  "+lastname+ " "+gradeYear+" "+studentID);

			setStudentID();
		}
		
		private void setStudentID() {
			id++;
			this.studentID = gradeYear+" "+ id;
		}
		
		public void enroll() {
		
		do {
			System.out.println("Enter course to enroll (Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(course.equals("Q")) {
				courses=courses+"\n"+course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}else {
				//System.out.println("BREAK");
				break;
			}
		}while(1!=0);
		System.out.println("enrolled in:" +courses);
		//System.out.println("tuition balance:" +tuitionBalance);
		}
		public void viewBalance() {
			System.out.println("your balance is $:" + tuitionBalance);	
		}
		public void payTuition() {
			viewBalance();
			System.out.println("enter your payment:$");
			Scanner in =new Scanner(System.in);
			int payment = in.nextInt();
			tuitionBalance = tuitionBalance-payment;
			System.out.println("Thank you for payment $" +payment);
			viewBalance();
		}
}
