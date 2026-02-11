class HairDryer{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The hairdryer is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The hairdryer is off");
		}
		return isTurnedOn;
	}
}