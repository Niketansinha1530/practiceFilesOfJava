package practiceJava;

public class MergeSort {
	public static void mergeprocedure(int arr[],int l,int mid, int r)
	{
		int i,j,k;
		int n1=mid-l+1;
		int n2=r-mid;
		
		int lsub[]=new int[n1];
		int rsub[]=new int[n2];
		
		for(i=0;i<n1;i++)
		{
			lsub[i]=arr[i+l];
		}
		for(j=0;j<n2;j++)
		{
			rsub[j]=arr[mid+1+j];
		}
		i=0;
		j=0;
		k=l;
		while(i<n1 &&j<n2)
		{
			if(lsub[i]<=rsub[j])//assending order//>desending order.
			{
				arr[k]=lsub[i];
				i++;
			}
			else {
				arr[k]=rsub[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=lsub[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rsub[j];
			j++;
			k++;
		}
	}
	public static void mergesort(int arr[],int l,int r)
	{
		if(l<r) {
			int mid=l+(r-l)/2;
			
			mergesort(arr, l, mid);
			mergesort(arr,mid+1,r);
			mergeprocedure(arr,l,mid,r);
		}
	}
	public static void printArray(int arr[])
	{
		for(int i: arr)
		{
			System.out.print(i+" ");
		}
	}
public static void main(String[] args) {
	int arr[]= {45,65,74,24,23,100,41,200};
	int n=arr.length;
	System.out.println("Array before sorting: ");
	printArray(arr);
	mergesort(arr, 0,n-1);
	System.out.println("Array after sorting: ");
	printArray(arr);
}
}
