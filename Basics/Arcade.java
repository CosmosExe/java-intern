class Arcade{
	public static void main(String[] lulu){
		String name = "Funtura";
		String owner = "Rinith";
		String address = "12th cross, Rajajinagar, Bengaluru, Karnataka";
		String branches[] = {"Rajajinagar","Kormangala","Whitefield"};
		String games[] = {"PacMan","Tetris","Shooting Range","Scary House","VR SHooter","Racing Sim"};
		
		System.out.println("The name of the Arcade is "+name);
		System.out.println("The owner of this Arcade is "+owner);
		System.out.println("Arcade address: "+address);
		System.out.println("There are "+branches.length+" branches in the city");
		for(String branchList:branches) System.out.println(branchList);
		System.out.println("The arcade consists of "+games.length+" games");
		for(String gamesAvail:games) System.out.println(gamesAvail);
	}
}