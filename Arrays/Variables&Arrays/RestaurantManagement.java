class RestaurantManagement{
	public static void main(String[] brick){
		String name = "Brick & Basil";
		String location = "Near Kundvad Lake, Davangere, Karnataka";
		int totalTables = 10;
		String foodMenu[] = {"Garlic Bread","Peri Peri Fries","Korean Fries","6 Inch Pizza","12 Inch Pizza"};
		String drinkMenu[] = {"Non-Alchoholic Beer","Coke Zero","Monster Energy","Coke"};
		
		System.out.println("The name of the restaurant is "+name);
		System.out.println("It is located "+location);
		System.out.println("It consists of "+totalTables+" tables");
		System.out.println("It has "+foodMenu.length+" items in the Food Menu");
		for(String food:foodMenu) System.out.println(food);
		System.out.println("It has "+drinkMenu.length+" items in the Drink Menu");
		for(String drink:drinkMenu) System.out.println(drink);
	}
}
