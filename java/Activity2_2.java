package JavaActivityDay2;

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException
	{
		Plane plane =  new Plane(10);
		plane.onboard("kevin");
		plane.onboard("manas");
		plane.onboard("joe");
		plane.onboard("saachi");

		System.out.println("plane take off time:"+plane.takeOff());
		System.out.println("list of passengers:"+ plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("landing time of plane is:"+plane.getLastTimeLanded());

	}
}
