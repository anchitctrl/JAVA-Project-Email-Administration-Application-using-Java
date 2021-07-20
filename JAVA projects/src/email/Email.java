package email;

import java.util.Scanner;

public class Email {
	//using private because we don't want everyone to access these things.
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultpasswordlength=10;
	private String alternateEmail;
	private String suffix="learners.com";

	//Constructor to receive first and last name
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
//		System.out.println("Created: "+this.firstName+" "+this.lastName);
		
		//call a method asking for the department - return department
		this.department=setDepartment();
//		System.out.println("Department: "+ this.department);
		
		//call a method that generates random password
		this.password=randomPass(defaultpasswordlength);
		System.out.println("Your PASSWORD is: "+this.password);
		
		//combine elements to generate emails
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+suffix;
//		System.out.println("Your Email is: "+email);
	}
	
	//method to Ask for department mode
	private String setDepartment() {
		System.out.println("NEW WORKER: "+firstName+"\nCODES FOR AVAILABLE DEPARTMENTS\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter the Department code: ");
		Scanner sc=new Scanner(System.in);
		int depChoice=sc.nextInt();
		if(depChoice==1) return "sales";
		else if(depChoice==2) return "dev";
		else if(depChoice==3) return "acc";
		else return "";
	}
	
	//Generate Random password
	private String randomPass(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@$#%";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAltEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.changePassword(password);
	}
	
	//get methods
	public int getMailBoxCapacity(){
		return mailboxCapacity;
	}
	public String getAltEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	//print all the data
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
		
	}
}
