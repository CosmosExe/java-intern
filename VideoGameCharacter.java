class VideoGameCharacter{
	public static void main(String[] v){
		String name = "V";
		String videoGame = "Cyberpunk2077";
		String pathWays[] = {"Nomad","Street Rat","Corpo"};
		String cyberWare[] = {"Daemons","Quickhacks","Electrocute","Mantis Baldes","XRay Vision"};
		
		System.out.println("The name of the Videogame is "+videoGame);
		System.out.println("The character in the Videogame is called "+name);
		System.out.println("The game gives you "+pathWays.length+" paths to choose from");
		for(String path:pathWays) System.out.println(path);
		System.out.println("It gives you "+cyberWare.length+" cyberwares to play with");
		for(String cyber:cyberWare) System.out.println(cyber);
	}
}