class Instagram{
	public static void main(String[] insta){
		createInstagramAccount("noobsnightmre@gmail.com", "Finesse2929", "08/01/2004", "Rinith Ramesh", "Cosmos");
	}
	static void createInstagramAccount(String email, String password, String dateOfBirth, String fullName, String userName){
		System.out.println("User's email : "+email);
		System.out.println("Password : "+password);
		System.out.println("User's date of birth : "+dateOfBirth);
		System.out.println("Full name of the user : "+fullName);
		System.out.println("Username : "+userName);
	}
}