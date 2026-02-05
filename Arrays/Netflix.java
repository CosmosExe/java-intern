class Netflix{
	public static void main(String[] genres){
		String englishMovies[] = {"Frankenstien","Kidnapped","A Time To Kill","Scent Of A Woman","Train Dreams","Champagne Problems","Seven Years In Tibet","Remember Me","Shutter Island","The White Tiger","Speak No Evil","Taxi Driver","Central Intelligence","Good Will Hunting","Don't Look Up","The Perks Of Being A Wallflower","Django","No Hard Feelings","Into The Wild","Red Notice"};
		String hindiMovies[] = {"Tere Ishk Mein","Dhurandhar","Mardaani 2","Mardaani","Homebound","Chennai Express","Rocket Singh","The Diplomat","Baramulla","Dhadak 2","Chak De","Jaat","Animal","Chor Nikal Ke Bhaga","Student Of The Year","Sultan","Badmaash Company","Yeh Jawaani Hai Deewani","Veer-Zaara","Saiyaara"};
		String tamilMovies[] = {"Bison","Dragon","Idli Kadai","Maharaja","Stephen","Dude","Maareegan","Paava Kadhaigal","DON","Retro","Good Bad Ugly","Oho Entan Baby","Kaantha","Amaran","Thug Life","Indian 2","GOAT","Aaryan","Leo","Perusu","Test"};
		String teluguMovies[] = {"Champion","Little Hearts","Dremantle","Andhra King","Court","Hit","Mad","Lucky Baskhar","Akhanda","Pushpa 2","They Call Him OG","Hi Nanna","Daaku Maharaaj","Jack","Sanivaaram","Salaar","Mass Jathara","Mad 2","Devara","The Girlfriend"};
		String malayalamMovies[] = {"Officer","Eko","CBI 5","Minnal Murli","Vllozhukku","Forensic","Detective Ujjwalan","Curry & Cyanide","Iratta","Teacher","Thallumaala","RDX","Rekha","Kumari","Bahubali 1","Bahubali 2","Rife Club","Love","Night Drive","Thundu","Major","Attention Please"};
		
		System.out.println("English Movies:");
		for(String english:englishMovies) System.out.println(english);
		System.out.println("Hindi Movies:");
		for(String hindi:hindiMovies) System.out.println(hindi);
		System.out.println("Tamil Movies:");
		for(String tamil:tamilMovies) System.out.println(tamil);
		System.out.println("Telugu Movies:");
		for(String telugu:teluguMovies) System.out.println(telugu);
		System.out.println("Malayalam Movies:");
		for(String malayalam:malayalamMovies) System.out.println(malayalam);
	}
}