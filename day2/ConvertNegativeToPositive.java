package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=20;
		int convertedNumber;
		if(input>0)
			System.out.println("Number is positive");
		else if(input<0)
		{
			convertedNumber=input*-1;
			System.out.println("Converted number is "+convertedNumber);
		}
		else
			System.out.println("Number is neither postive nor negative");

	}

}
