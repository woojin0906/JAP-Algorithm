package algorithm.five;

public class MergeSort {
	public static void merge(int A[], int low, int mid, int high) {
		int h, i, j, k;
		int[] B = new int[high + 1];
		
		h = low; i = low; j = mid + 1;
		
		while(i <= mid && j <= high) {
			if(A[i] <= A[j]) {
				B[h] = A[i];
				i = i + 1;
			} else {
				B[h] = A[j];
				j = j + 1;
			}
			h = h + 1;
		}
		
		if(i > mid) {
			for(k = j; k <= high; k++) {
				B[h] = A[k];
				h = h + 1;
			}
		} else
			for(k = i; k <= mid; k++) {
				B[h] = A[k];
				h = h + 1;
			}
		
		for(k = low; k <= high; k++)
			A[k] = B[k];
	}
	
	public static void mergeSort(int A[], int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			
			mergeSort(A, low, mid);
			
			mergeSort(A, mid + 1, high);
			
			merge(A, low, mid, high);
		}
	}
	
	public static void printArray(int A[]) {
		for(int i = 0; i < A.length; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int A[] = {91, 82, 13, 85, 68, 70, 98, 24};
		
		System.out.println("주어진 배열");
		printArray(A);
		
		mergeSort(A, 0, A.length-1);
		
		System.out.println("\n정렬된 배열");
		printArray(A);
	}
}
