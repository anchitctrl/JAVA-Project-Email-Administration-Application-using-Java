package email;

public class Emailapp {

	public static void main(String[] args) {
		Email em1=new Email("Anchit","Aggarwal");
		
//		em1.setAltEmail("test.test@test.com");
//		System.out.println(em1.getAltEmail());
		
		System.out.println(em1.showInfo());	
	}
}
