package day1.assignment1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 231341321L;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 15.23121;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler Activa = new TwoWheeler();
		System.out.println("No of wheels in Activa "+Activa.noOfWheels);
		System.out.println("No of mirrors in Activa "+Activa.noOfMirrors);
		System.out.println("ChassisNumber of Activa "+Activa.chassisNumber);
		System.out.println("Is wheels punctured "+Activa.isPunctured);
		System.out.println("BikeName "+Activa.bikeName);
		System.out.println("No of KMs "+Activa.runningKM);
	}

}
