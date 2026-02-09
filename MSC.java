class MSC{
	public static void main(String[] msc){
		createMSCAccount("Induvidual", "Xworkz", "Rinith", "Ramesh", "noobsnightmre@gmail.com", "Cosmos", "Finesse2929", "Finesse2929");
	}
	static void createMSCAccount(String accountType, String company, String firstName, String lastName, String email, String userName, String password, String repeatPassword){
		System.out.println("Account type of the user : "+accountType);
		System.out.println("Company the user works in : "+company);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's email ID : "+email);
		System.out.println("Username : "+userName);
		System.out.println("Password : "+password);
		System.out.println("Confirm password : "+repeatPassword);
	}
}