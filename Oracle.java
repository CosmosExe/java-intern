class Oracle{
	public static void main(String[] java){
		createOracleAccount("noobsnightmre@gmail.com", "Finesse2929", "Finesse2929", "India", "Rinith", "Ramesh", 6366327453L, "XWorkz", 577004);
	}
	static void createOracleAccount(String email, String password, String repeatPassword, String country, String firstName, String lastName, long phoneNumber, String company, int zipcode){
		System.out.println("User's email : "+email);
		System.out.println("Password : "+password);
		System.out.println("Confirm password : "+repeatPassword);
		System.out.println("User's country of origin : "+country);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("Phone number of the user : "+phoneNumber);
		System.out.println("Company the user is working in : "+company);
		System.out.println("Zipcode of the user's living area : "+zipcode);
	}
}