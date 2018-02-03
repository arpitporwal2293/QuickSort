
public class QuickSort {

	public void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public int partition(int[] arr,int low,int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	public void quickSort(int[] arr,int low,int high){
		if(low<high){
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	
	public void printArr(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,5,2,9,7,8};
		QuickSort sort = new QuickSort();
		sort.quickSort(arr, 0, arr.length-1);
		sort.printArr(arr);
	}
	
}
