package algorithm.three;

	public class insertSortChange {
		public static void main(String[] args) {
			int[] array = {25, 30, 1, 47, 5, 26, 36, 90};
			
			System.out.print("정렬 전 배열: ");
			for(int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			
				insertionSort(array);
				
			System.out.print("정렬 후 배열: ");
			for (int i=0; i < array.length; i++) {
					System.out.print(array[i] + " ");
			}
			System.out.println();
		}

		private static void insertionSort(int[] iArr) {
			
			for(int i = 1; i < iArr.length; i++) {
				int insertElement = iArr[i];
				int j = i - 1;
				
				while(j >= 0 && iArr[j] < insertElement) {
					iArr[j + 1] = iArr[j];
					j = j - 1;
				}
				
				iArr[j + 1] = insertElement;
			}
	}
}
