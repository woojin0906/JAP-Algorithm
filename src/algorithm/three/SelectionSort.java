package algorithm.three;

public class SelectionSort {
	public static void main(String[] args) {
	int[] array = {25, 30, 1, 47, 5, 26, 36, 90};
		
		System.out.print("정렬 전 배열: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		selectionSort(array);
			
		System.out.print("정렬 후 배열: ");
		for (int i=0; i < array.length; i++) {
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	private static void selectionSort(int[] iArr) {
		int min, temp;
		
		for(int i = 0; i < iArr.length - 1; i++) {
			min = i;
			
			for(int j = i + 1; i < iArr.length; j++)
				if(iArr[j] < iArr[min])
					min = j;
			
			temp = iArr[min];
			iArr[min] = iArr[i];
			iArr[i] = temp;
		}
	}
}
