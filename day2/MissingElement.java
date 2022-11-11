package week1.day2;

public class MissingElement {

	public static void main(String[] args) {
		int data[]= {3,1,4,6,2,8,7};
		int temp;
		
		//sort
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
		//find the missing element
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=i+1)
			{
				System.out.println("Missing element:"+(i+1));
				break;
			}
			
		}
	}

}
