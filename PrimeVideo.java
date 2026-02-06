class PrimeVideo{
	public static void main(String[] amazon){
		String englishMovies[] = {"The Boy","Hotel Transylvania Transformania","The Nun","The Angry Birds","Madagascar","Spiderman Into The Spiderverse","The Angry Birds 2","Babygirl","Original Sin","Penguins Of Madagascar","Flow","Kung Fu Panda","Mission Impossible","SpiderMan: No Way Home","John Wick"};
		String hindiMovies[] = {"Rocky Aur Rani","Drishyam 2","Kanchana 2","120 Bahadur","Bacchan Pandey","Thamma","Sector 375","Satyaprem Ki Katha","Gehraiyaan","Marjaavan","Chhorii","Ram Setu","Phir Hera Pheri","Housefull 5A","Bawaal","Stree 2","Sonu Ki Tity Ki Sweety","Runaway 34"};
		String horrorMovies[] = {"Thamma","Stree 2","Jatadhara","The Boy","Chhorii","Odela 2","Pechi","Heriditary","Tumbaad","Together","Dybbuk","American Psycho","Train To Busan","Wrong Turn","Apocalypse Z","The Conjuring 2","Chhorii 2","IT","The Conjuring","Annabelle Creation","The Vatican Tapes"};
		String sciFiMovies[] = {"Kalki","Yashoda","SpiderMan: No Way Home","Teri Baaton Mein Aisa Uljha Jiya","The Twilight Saga","Inception","Together","Interstellar","Jurassic Park","Godzilla King Of The Monters","Godzilla Vs Kong","The Truman Show","The Mummy","The Meg","SpiderMan: Far From Home","The Tomorrow War","SpiderMan 3","Jurassic World","Justice League","The Witch","Gravity","Aquaman"};
		String actionMovies[] = {"120 Bahadur","Kantara Chapter 1","The Wrecking Crew","Kantara","Pushpa 2","Jailer","Kalki","Coolie","Spy","Varisu","Yashoda","Sita Ramam","Bigil","Bacchan Pandey","Adipurush","Ram Setu","Bholaa","Hit","V","Train To Busan"};
		
		System.out.println("English Movies:");
		for(String english:englishMovies) System.out.println(english);
		System.out.println("Hindi Movies:");
		for(String hindi:hindiMovies) System.out.println(hindi);
		System.out.println("Horror Movies:");
		for(String horror:horrorMovies) System.out.println(horror);
		System.out.println("SciFi Movies:");
		for(String sciFi:sciFiMovies) System.out.println(sciFi);
		System.out.println("Action Movies:");
		for(String action:actionMovies) System.out.println(action);
	}
}