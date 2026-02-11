class WaterHeaterExecutor{
	public static void main(String[] hot){
		boolean isOn = WaterHeater.onOrOff();
		System.out.println("Is the water heater on? : "+isOn);
	}
}