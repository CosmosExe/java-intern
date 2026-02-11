class Light{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The light is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The light is off");
		}
		return isTurnedOn;
	}
}