import java.util.*
public class mergesort{
		
	public static void mergesort(int arr[],int low,int high){
		int low=0;
		int high=arr.length;
		if(low<high){
			int mid=(low+high)/2;
			mergesort(arr,low,mid);
			mergesort(arr,mid+1,high);
			merge(low,mid,high);
		}
	}
	public static void merge(low,mid,high)
	{
		public static int[] ar;
		int i=low;int j=mid+1;int k=low;
		while(i<=mid&&j<=high){
			if(arr[i]<=arr[j]){
				ar[k]=arr[i]
				i=i+1;
			}
			else{
				ar[k]=arr[j];
				j=j+1;
			}
			k++;
		}
		while(i<=mid)
		{
			ar[k]=arr[i];
			i++;
			k++;
		}
		while(j<=high)
		{
			ar[k]=arr[j];
			j++;
			k++
		}
		for(int l=low;l<=high;l++){
			arr[l]=ar[l];
		}
	}
}
class main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		}
		mergesort(arr,0,n-1);
		System.out.println("sorted elements");
		for(int num:arr){
		System.out.println(num+" ");
	}
}
