package practiceJava;

public class checkingArrayisSorted {

	static boolean checked(int arr[]) {
		boolean flag = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i-1]) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 13, 8, 11, 12 };
		boolean result=checked(arr);
		
		if(result==false)
		{
			System.out.println("not sorted");
		}
		else {
			System.out.println("Sorted");
		}
	}

}
