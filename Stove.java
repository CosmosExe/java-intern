class Stove{
	static boolean isTurnedOn;
	
	static boolean onOrOff(){
		if(isTurnedOn == false){
			isTurnedOn = true;
			System.out.println("The stove is on");
		}
		else{
			isTurnedOn = false;
			System.out.println("The stove is off");
		}
		return isTurnedOn;
	}
}