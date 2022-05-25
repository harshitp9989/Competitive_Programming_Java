package Array_package;

public class ReverseArray {
	public void printArr(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void reverseMethod(int[] arr, int start, int end)
	{
		int n = arr.length;
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		printArr(arr);
		
	}
	
	public static void main(String[] args)
	{
		ReverseArray ra = new ReverseArray();
		int[] sample = {1,2,3,4,5,6,7,8,9,10};
		ra.printArr(sample);
		ra.reverseMethod(sample,0,sample.length-1);

	}
}
