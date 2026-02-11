class AlexaExecutor{
	public static void main(String[] amazon){
		boolean isOn = Alexa.onOrOff();
		System.out.println("Is Alexa on? : "+isOn);
	}
}