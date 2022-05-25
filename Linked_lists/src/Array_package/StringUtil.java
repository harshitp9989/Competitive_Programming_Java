package Array_package;

public class StringUtil {
	public boolean isPalindrome(String word)
	{
		char[] arr =word.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while(start<end)
		{
			if(arr[start]!=arr[end])
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		StringUtil su = new StringUtil();
		if(su.isPalindrome("MADAM"))
		{
			System.out.println("The string is palindrome");
		}
		else
		{
			System.out.println("The string is NOT palindrome");
		}
	}
		
}
