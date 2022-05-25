package Array_package;

public class ArrayUtil {
	public void printArray(int[] arr)
	{
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public int[] arrayDemo()
	{
		int[] myArray = new int[5];
		myArray[0] = 5;
		myArray[1] = 6;
		myArray[2] = 8;
		myArray[3] = 1;
		myArray[4] = 3;
//		System.out.println("Array length: "+myArray.length);
//		System.out.println("Printing last element... "+myArray[myArray.length-1]);
		return myArray;
	}
	
	public int[] resizeArr(int[] arr, int newCapacity)
	{
		System.out.println("old Array length: "+arr.length);
		int[] temp = new int[newCapacity];
		for(int i =0; i<arr.length; i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
		System.out.println("new Array length: "+arr.length);
		return arr;
	}
	
	public static void main(String[] args)
	{
		ArrayUtil au = new ArrayUtil();
		int[] oldArr = au.arrayDemo();
		int[] newArr =au.resizeArr(oldArr, 20);
		au.printArray(oldArr);
		au.printArray(newArr);
	}
}

