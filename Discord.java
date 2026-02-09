class Discord{
	public static void main(String[] discord){
		createDiscordAccount("noobsnightmre@gmail.com", "Cosmos", "Cosmos_Exe", "Finesse2929", "01/08/2004");
	}
	static void createDiscordAccount(String email, String username, String displayName, String password, String dateOfBirth){
		System.out.println("User's email : "+email);
		System.out.println("Username : "+username);
		System.out.println("Display name of the user : "+displayName);
		System.out.println("Password : "+password);
		System.out.println("User's date of birth : "+dateOfBirth);
	}
}