class ECommerce{
	public static void main(String[] amazon){
		String name = "Amazon";
		String owner = "Not Jeff Bezos";
		String availRegions[] = {"India","United States","Russia","Brazil","Europe","Indonesia","UAE"};
		String availProducts[] = {"Electronics","Home Appliances","Kitchen Appliances","Toys"};
		
		System.out.println("The name of the ECommerce website is "+name);
		System.out.println("The owner of the website is "+owner);
		System.out.println("It is available in "+availRegions.length+" regions");
		for(String regions:availRegions) System.out.println(regions);
		System.out.println("There are "+availProducts.length+" products available on the website");
		for(String products:availProducts) System.out.println(products);
	}
}