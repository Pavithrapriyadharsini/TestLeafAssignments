package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=13;
		boolean isPrime=true;
		if(num!=2)
		{
		for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime=false;
					break;
				}
					
			}
		}
		if(isPrime==true)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
