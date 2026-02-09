class FaceBook{
	public static void main(String[] fb){
		createFBAccount("Rinith", "Ramesh", "08/01/2004", "Male", "noobsnightmre@gmail.com", "Finesse2929");
	}
	static void createFBAccount(String firstName, String lastName, String dateOfBirth, String gender, String email, String password){
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's date of birth : "+dateOfBirth);
		System.out.println("Gender of the user : "+gender);
		System.out.println("User's email : "+email);
		System.out.println("Password : "+password);
	} 
}