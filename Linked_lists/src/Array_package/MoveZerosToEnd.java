package Array_package;  // interesting problem

public class MoveZerosToEnd {

	public void printArr(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void moveZeros(int[] arr)
	{
		int n = arr.length;
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0 && arr[j]==0)
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
	}
	
	public static void main(String[] args)
	{
		MoveZerosToEnd mzte = new MoveZerosToEnd();
		int[] sample = {0,2,3,0,0,6,7,8,9,10};
		mzte.printArr(sample);
		mzte.moveZeros(sample);
		mzte.printArr(sample);
	}
}
