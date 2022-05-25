package Array_package;

public class FindMissingNumber {
	
	public static int findMissing(int[] arr)
	{
		int n =arr.length +1;
		int sum = n*(n+1) / 2;
		for(int num : arr)
		{
			sum = sum - num;
		}
		return sum;
	}
	
	public static void printArr(int[] arr)
	{
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		System.out.println(" ");

	}
	
	public static void arrayDemo()
	{
		int[] arr = {1,2,3,4,6};
		printArr(arr);
		System.out.println("The missing number is..."+ findMissing(arr));	
	}
	
	public static void main(String[] args)
	{
		FindMissingNumber.arrayDemo();
	}

}
