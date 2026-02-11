class Headphone{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The headphone is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The headphone is off");
		}
		return isTurnedOn;
	}
}