package algorithm.five;

public class QuickSort {
	
	public static int partition(int S[], int low, int high) {
		int i, j, temp;
		
		i = low + 1;
		j = high;
		
		while(i <= j) {
			if(S[i] <= S[low]) i = i + 1;
			else if(S[j] > S[low]) j = j - 1;
			else {
				temp = S[i];
				S[i] = S[j];
				S[j] = temp;
				i = i + 1;
				j = j - 1;
			}
		}
		
		temp = S[low];
		S[low] = S[j];
		S[j] = temp;
		
		return j;
	}
	
	public static void quickSort(int S[], int low, int high) {
		int pivotPoint;
		
		if(low < high) {
			pivotPoint = partition(S,low, high);
			quickSort(S, low, pivotPoint - 1);
			
			quickSort(S, pivotPoint + 1, high);
		}
	}
	
	public static void printArray(int A[]) {
		for(int i = 0; i < A.length; ++i)
			System.out.print(A[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int A[] = {15, 22, 13, 27, 12, 10, 20, 25, 32};
		
		System.out.println("주어진 배열");
		printArray(A);
		
		quickSort(A, 0, A.length - 1);
		
		System.out.println("\n정렬된 배열");
		printArray(A);
	}
}
