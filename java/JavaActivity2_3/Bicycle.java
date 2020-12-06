package JavaActivity2_3;

class Bicycle implements BicycleOperations,BicycleParts{

	public int gears;
	public int currentSpeed;
	public  Bicycle(int gears, int currentSpeed) {
		// TODO Auto-generated constructor stub
	this.gears = gears;
	this.currentSpeed = currentSpeed;
	}
	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
			currentSpeed -= decrement;
			System.out.println("current speed is :"+ currentSpeed);
	}
	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed =+ increment;
		System.out.println("speed up:"+ currentSpeed );
	}
	
	public String bicycleDesc()
	{
		return ("no.of gears:"+ gears + "\n current speed is:"+ currentSpeed);
		
	}
	
}

