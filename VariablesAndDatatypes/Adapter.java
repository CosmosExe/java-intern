class Adapter{
	static int price = 579;
	static String brandName = "RTS";
	static String modelNumber = "UTA01";
	static String itemType = "Universal Travel Adapter";
	static String inputVoltage = "240 Volts";
	static String outputVoltage = "5 Volts";
	static String originCountry = "China";
	static String manufacturer = "9104325119, RTS";
	static String asin = "B082WYMTWF";
	public static void main(String[] rts){
		/*int price = 579;
		String brandName = "RTS";
		String modelNumber = "UTA01";
		String itemType = "Universal Travel Adapter";
		String inputVoltage = "240 Volts";
		String outputVoltage = "5 Volts";
		String originCountry = "China";
		String manufacturer = "9104325119, RTS";
		String asin = "B082WYMTWF";*/
		
		System.out.println("Type of Product : " + itemType);
		System.out.println("Name of the Brand : " + brandName);
		System.out.println("Price : Rs" + price);
		System.out.println("Model Number : " + modelNumber);
		System.out.println("Input Voltage : " + inputVoltage);
		System.out.println("Output Voltage : " + outputVoltage);
		System.out.println("Country of Origin : " + originCountry);
		System.out.println("ASIN : " + asin);
		System.out.println("Manufacturer : " + manufacturer);
	}
}