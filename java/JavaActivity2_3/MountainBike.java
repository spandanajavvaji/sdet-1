package JavaActivity2_3;


class MountainBike extends Bicycle{

	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int startHeight) {
		super(gears, currentSpeed);
		seatHeight= startHeight;
	}
		public String bicycleDesc()
		{
			return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
		}
		public static void main(String [] args)
		{
			MountainBike bike = new MountainBike(21, 9, 67);
			System.out.println(bike.bicycleDesc());
			bike.speedUp(10);
			bike.applyBrake(20);
					
			
		}
 
	}
