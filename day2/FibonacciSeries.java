package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secondNum=1;
		int sum;
		int range = 8;
		for(int i=1;i<=range;i++)
		{
			System.out.print(firstNum+",");
			sum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
			
		}

	}

}
