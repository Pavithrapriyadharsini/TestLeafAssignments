package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int original=num;
		int sum=0;
		int tempCalc;
		while(num>0)
		{
			tempCalc=num%10;
			sum=sum+(tempCalc*tempCalc*tempCalc);
			num=num/10;
			
			
		}
		if(sum==original) {
			System.out.println("Number is armstrong");
		}
		else
			System.out.println("Not Armstrong");

	}

}
