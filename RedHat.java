class RedHat{
	public static void main(String[] redHat){
		createRedHatAccount("Cosmos", "Finesse2929", "Rinith", "Ramesh", "noobsnightmre@gmail.com", "Data Analyst", "India");
	}
	static void createRedHatAccount(String username, String password, String firstName, String lastName, String email, String jobRole, String country){
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		System.out.println("First name of the user : "+firstName);
		System.out.println("Last name of the user : "+lastName);
		System.out.println("User's email : "+email);
		System.out.println("Job role of the user : "+jobRole);
		System.out.println("User's country of origin : "+country);
	}
}