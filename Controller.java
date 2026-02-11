class Controller{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The controller is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The controller is off");
		}
		return isTurnedOn;
	}
}