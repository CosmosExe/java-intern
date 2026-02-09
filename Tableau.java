class Tableau{
	public static void main(String[] data){
		createTableauAccount("Rinith", "Ramesh", "noobsnightmre@gmail.com", "India", 6366327453L);
	}
	static void createTableauAccount(String firstName, String lastName, String buisnessEmail, String country, long phoneNumber){
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's buisness email : "+buisnessEmail);
		System.out.println("User's country of origin : "+country);
		System.out.println("Phone number of the user : "+phoneNumber);
	}
}