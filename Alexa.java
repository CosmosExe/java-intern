class Alexa{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("Alexa is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("Alexa is off");
		}
		return isTurnedOn;
	}
}