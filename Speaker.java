class Speaker{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The speaker is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The speaker is off");
		}
		return isTurnedOn;
	}	
}