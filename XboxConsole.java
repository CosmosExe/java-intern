class XboxConsole{
	public static void main(String[] xbox){
		String gamerTag = "CosmosDxD";
		String consoleModel = "Xbox Series X";
		String gameList[] = {"Forza Horizon 5","NFS Heat","Hollow Knight","Assassins Creed:Black Flag"};
		String friendsList[] = {"CloudyGrape635","OniXD","ClaireObsucre","ShroudRahil"};
		
		System.out.println("The console model is "+consoleModel);
		System.out.println("My Gamer Tag in the console is "+gamerTag);
		System.out.println("There are "+gameList.length+" games downloaded on the console");
		for(String game:gameList) System.out.println(game);
		System.out.println("I have "+friendsList.length+" friends on that console");
		for(String friends:friendsList) System.out.println(friends);
	}
}