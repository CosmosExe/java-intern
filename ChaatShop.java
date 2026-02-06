class ChaatShop{
	public static void main(String[] namkeen){
		String chaats[] = {"Peni Puri","Masala Puri","Sev Puri","Dahi Puri","Aloo Tikki Chatt","Papdi Chaat","Bhel Puri","Samosa Chaat","Kachori Chaat","Pav Bhaji","Vada Pav"};
		
		System.out.println("There are "+chaats.length+" chaats avaialble at the chaat shop");
		for(String variety:chaats) System.out.println(variety);
	}
}