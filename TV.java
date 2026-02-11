class TV{
	static boolean isDisplayOn;
	
	static boolean onOrOff(){
		if(isDisplayOn == false){
			isDisplayOn = true;
			System.out.println("The TV is on");
		}
		else{
			isDisplayOn = false;
			System.out.println("The TV is off");
		}
		return isDisplayOn;
	}
}