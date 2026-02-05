class CarBrands{
	public static void main(String[] cars){
		String brands[] = {"BMW","Volkswagen","Porsche"};
		
		//Bad Method
		String sedan = brands[0];
		String hatchBack = brands[1];
		String luxury = brands[2];
		int amount = brands.length;
		
		System.out.println("There are "+amount+" car brands");
		System.out.println(sedan+" "+hatchBack+" "+luxury);
		
		//Good Method
		System.out.println("For loop starts here:");
		for(String list:brands){
			System.out.println(list);
		}
	}
}