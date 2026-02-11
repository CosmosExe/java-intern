class ControllerExecutor{
	public static void main(String[] xbox){
		boolean isOn = Controller.onOrOff();
		System.out.println("Is the controller on? : "+isOn);
	}
}