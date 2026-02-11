class GlobalSrc{
	static void createGlobalSrcAccount(String country, String firstName, String lastName, String email, String password, String repeatPassword, long phoneNumber){
		System.out.println("User's country of origin : "+country);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's email : "+email);
		System.out.println("Password : "+password);
		System.out.println("Confirm password : "+repeatPassword);
		System.out.println("Phone number of the user : "+phoneNumber);
	}
}