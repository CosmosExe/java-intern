class Samsung{
	public static void main(String[] samsung){
		createSamsungAccount("noobsnightmre@gmail.com", "Finesse2929", "Finesse2929", "Rinith", "Ramesh", "01/08/2004");
	}
	static void createSamsungAccount(String email, String password, String repeatPassword, String firstName, String lastName, String dateOfBirth){
		System.out.println("User's email : "+email);
		System.out.println("Password : "+password);
		System.out.println("User's password : "+repeatPassword);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's date of birth : "+dateOfBirth);
	}
}