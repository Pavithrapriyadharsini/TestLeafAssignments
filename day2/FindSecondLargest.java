package week1.day2;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {3,2,11,4,6,7};
		int temp;
		//sorting
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
			
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		System.out.println("Second largest number : "+data[data.length-2]);

	}

}
