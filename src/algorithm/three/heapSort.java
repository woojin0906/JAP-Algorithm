package algorithm.three;

public class heapSort {

	public static void main(String[] args) {
		int intArray[] = {0, 1, 2, 6, 4, 8, 7};
		int i;
		
		System.out.print("정렬 전 배열 : ");
		
		for(i = 1; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		heapSort(intArray);
		
		System.out.print("\n정렬 후 배열 : ");
		
		for(i = 1; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}

	private static void heapSort(int[] A) {
		int eh, temp;
		
		eh = A.length - 1;
		
		buildHeap(A, eh);
		
		while(eh > 1) {
			temp = A[1];
			A[1] = A[eh];
			A[eh] = temp;
			
			eh = eh - 1;
			
			pushDown(A, 1, eh/2, eh);
		}
	}

	private static void buildHeap(int[] A, int eh) {
		int bh, x;
		
		bh = (A.length - 1)/2 + 1;
		
		while(bh > 1) {
			bh = bh - 1;
			x = bh;
			
			pushDown(A, x, bh, eh);
		}
	}
	private static void pushDown(int[] A, int x, int bh, int eh) {
		int y, temp;
		
		y = findLarger(A, x, eh);
		
		while(A[x] < A[y]) {
			temp = A[x];
			A[x] = A[y];
			A[y] = temp;
			
			x = y;
			
			y = findLarger(A, x, eh);
		}
	}

	private static int findLarger(int[] A, int x, int eh) {
		int y = 0;
		
		if(2 * x + 1 <= eh) { 
			if(A[2 * x] > A[x] || A[2 * x + 1] > A[x]) {
				if(A[2 * x] >= A[2 * x + 1]) y = 2 * x;
				else y = 2 * x + 1;
			}
		} else
			if(2 * x <= eh && A[2 * x] > A[x]) y = 2 * x;
		
		return y;
	}

}
