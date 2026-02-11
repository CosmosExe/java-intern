class WaterHeater{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The water heater is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The water heater is off");
		}
		return isTurnedOn;
	}
}