package practiceJava;

public class PracticeQuestionArray {
	public static int Occurence(int arr[],int target)
	{int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int arr[]= {5,8,2,4,5,2,8,5,2};
		System.out.println("Enter target value: ");
		int target=2;
		int result=Occurence(arr,target);
		System.out.println("Number occured= "+result);
	}

}
