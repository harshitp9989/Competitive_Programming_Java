package Array_package;

public class RemoveEvenInt {
	public static void printArr(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] removeEven(int[] arr)
	{
		int oddCount = 0;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				oddCount++;
			}
		}
		
		int[] newArr = new int[oddCount];
		int j =0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				newArr[j]=arr[i];
				j++;
			}
		}
		
		return newArr;
	}
	
	public static void main(String[] args)
	{
		int[] sample = {1,2,3,4,5,6,7,8,9,10};
		RemoveEvenInt.printArr(sample);
		int[] result = RemoveEvenInt.removeEven(sample);
		RemoveEvenInt.printArr(result);

	}
}
