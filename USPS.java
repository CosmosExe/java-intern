class USPS{
	public static void main(String[] usa){
		createUSPSAccount("English", "Cosmos", "Finesse2929", "Finesse2929", "Davangere" ,"Rinith" ,"Ramesh", "noobsnightmre@gmail.com", 6366327453L);
	}
	static void createUSPSAccount(String language, String username, String password, String repeatPassword, String bornCity, String firstName, String lastName, String emailID, long phoneNumber){
		System.out.println("User's preferred language : "+language);
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("Confirm password : "+repeatPassword);
		System.out.println("Birth place of the user : "+bornCity);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's email ID : "+emailID);
		System.out.println("Phone number of the user : "+phoneNumber);
	}
}