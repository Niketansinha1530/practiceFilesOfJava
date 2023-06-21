package practiceJava;

public class lastoccurenceElement {
	public static int last(int arr[],int target)
	{
	int lastIndex=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)
		{
			lastIndex=i;
		}
	}
	return lastIndex;
	}
public static void main(String[] args) {
	int arr[]= {5,8,2,4,5,2,8,5,2};
	
	int target=5;
	System.out.print(" target value= "+target);
	int result=last(arr,target);
	System.out.println("Last occurence of given no= "+result);
}
}

