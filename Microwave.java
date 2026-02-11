class Microwave{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The microwave is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The microwave is off");
		}
		return isTurnedOn;
	}
}