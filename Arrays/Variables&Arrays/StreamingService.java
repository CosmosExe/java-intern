class StreamingService{
	public static void main(String[] netflix){
		String name = "Netflix";
		int subscriptionCost = 999;
		String movies[] = {"Dhurandhar","Eko","Pacific Rim","Spiderman"};
		String series[] = {"Stranger Things","Good Doctor","Demon Slayer","Money Heist"};
		
		System.out.println("The name of the streaming service is "+name);
		System.out.println("It cost Rs "+subscriptionCost+" per month");
		System.out.println("There are "+movies.length+" movies avaialable on the platform");
		for(String movieName:movies) System.out.println(movieName);
		System.out.println("There are "+series.length+" series avaialable on the platform");
		for(String seriesName:series) System.out.println(seriesName);
	}
}