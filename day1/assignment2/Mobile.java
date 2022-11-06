package day1.assignment2;

public class Mobile {

	String mobileBrandName = "Apple";
	char mobileLogo = 'a';
	short noOfMobilePiece=100;
	int modelNumber=13;
	long mobileIMEINumber = 12335322464L;
	float mobilePrice=100000f;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile iphone=new Mobile();
		
		System.out.println("Brand:"+iphone.mobileBrandName);
		System.out.println("Logo :"+iphone.mobileLogo);
		System.out.println("No. of items:"+iphone.noOfMobilePiece);
		System.out.println("Model Number: "+iphone.modelNumber);
		System.out.println("IMEI: "+iphone.mobileIMEINumber);
		System.out.println("Price: "+iphone.mobilePrice);
		System.out.println("Status Damaged: "+iphone.isDamaged);
		
	}

}
