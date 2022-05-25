package Array_package;

public class MinArray {
	public void printArr(int[] arr)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int minElement(int[] arr)
	{
		int n = arr.length;
		int min = arr[0];
		for(int i=0;i<n;i++)
		{
			if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
		
	}
	
	public void findSecondMax(int[] arr)  // Nice technique to find 2nd max element
	{
		int max = arr[0];
		int max2 = Integer.MIN_VALUE;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2 && arr[i]<max)
			{
				max2=arr[i];
			}
//			System.out.println("max is :"+ max);
//			System.out.println("Second max is :"+ max2);
		}
		System.out.println("Second max is :"+ max2);
		
	}
	
	public static void main(String[] args)
	{
		MinArray ma = new MinArray();
		int[] sample = {10,2,3,4,5,6,7,8,9,10};
		ma.printArr(sample);
		System.out.println(ma.minElement(sample));
		ma.findSecondMax(sample);
	}
}
