package java_fundamentals;

public class q3 {
	public static void mergesort(int[] arr, int low, int high) {
		if(low<high) {
			int mid=low+(high-low)/2;
			mergesort(arr, low, mid);
			mergesort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	public static void merge(int[] arr, int low, int mid, int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		int[] left=new int[n1];
		int[] right=new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=arr[i+low];
		}
		for(int j=0;j<n2;j++) {
			right[j]=arr[mid+1+j];
		}
		int i = 0,j = 0; int k=low;
		while(i<left.length&&j<right.length) {
			if(left[i]<=right[j]) {
				arr[k]=left[i];
				k++;
				i++;
			}else {
				arr[k]=right[j];
				k++;
				j++;
			}
		}while(i<n1) {
			arr[k++]=left[i++];
		}while(j<n2) {
			arr[k++]=right[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr= {1, 10, 20, 4, 50 ,70};
		mergesort(arr, 0, arr.length-1);
		for(int num:arr) {
			System.out.print(num);
		}
	}

}
