class SpotifyMusic{
	public static void main(String[] myPlaylist){
		String musicList[] = {"Nine Thou","Tokyo Drift","Danza Kuduro","Levitating","REALiZE","Gasoline","Bumpy Ride","See You Again","Right Round","Blinding Lights"};
		
		//Bad Method
		String stylesOfBeyond = musicList[0];
		String teriyakiBoyz = musicList[1];
		String donOmar = musicList[2];
		String duaLipa = musicList[3];
		String liSA = musicList[4];
		String daddyYankee = musicList[5];
		String mohombi = musicList[6];
		String wizKhalifa = musicList[7];
		String floRida = musicList[8];
		String weeknd = musicList[9];
		int sizeOfPlaylist = musicList.length;
		
		System.out.println("I have "+sizeOfPlaylist+" songs in my Playlist");
		System.out.println(stylesOfBeyond+"|"+teriyakiBoyz+"|"+donOmar+"|"+duaLipa+"|"+liSA+"|"+daddyYankee+"|"+mohombi+"|"+wizKhalifa+"|"+floRida+"|"+weeknd);
		
		//Good Method
		System.out.println("For loop starts here:");
		for(String musicName:musicList){
			System.out.println(musicName);
		}
	}
}