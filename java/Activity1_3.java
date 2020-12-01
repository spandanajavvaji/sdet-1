package JavaActivity2;

public class Activity1_3 {
	
	public static void main(String[] args)
	{

	double seconds = 1000000000;
	double EarthSeconds = 31557600;
	double MercurySeconds = 0.2408467;
	double VenusSeconds = 0.61519726;
	double MarsSeconds = 1.8808158;
	double JupiterSeconds = 11.862615;
	double SaturnSeconds = 29.447498;
	double UranusSeconds = 84.016846;
	double NeptuneSeconds = 164.79132;
	
	System.out.println("age on mercury: "+ seconds / EarthSeconds/MercurySeconds);
	System.out.println("age on earth: "+ seconds / EarthSeconds);
	System.out.println("age on venus: "+ seconds / EarthSeconds/VenusSeconds);
	System.out.println("age on mars: "+ seconds / EarthSeconds/MarsSeconds);
	System.out.println("age on jupitar: "+ seconds / EarthSeconds/JupiterSeconds);
	System.out.println("age on saturn: "+ seconds / EarthSeconds/SaturnSeconds);
	System.out.println("age on uranus: "+ seconds / EarthSeconds/UranusSeconds);
	System.out.println("age on neptune: "+ seconds / EarthSeconds/NeptuneSeconds);
	
	
	
}
	
}