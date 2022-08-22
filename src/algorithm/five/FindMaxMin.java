package algorithm.five;

public class FindMaxMin {

	public int[] findMaxMin(int[] iArray, int i, int j) {
		int mid;
		int[] result = new int[2];
		int[] leftResult = new int[2];
		int[] rightResult = new int[2];
		
		if (i == j) {
			result[0] = iArray[i];
			result[1] = iArray[i];
		} else if(i == j-1) {
			if(iArray[i] < iArray[j]) {
				result[0] = iArray[i];
				result[1] = iArray[j];
			} else {
				result[0] = iArray[j];
				result[1] = iArray[i];
			}
		} else {
			mid = (i + j) / 2;
			leftResult = findMaxMin(iArray, i, mid);
			rightResult = findMaxMin(iArray, mid+1, j);
			
			if(leftResult[0] < rightResult[0]) {
				result[0] = leftResult[0];
			}
			if(leftResult[1] < rightResult[1]) {
				result[1] = rightResult[1];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] iArray = {24, 75, 92, 83, 61, 48, 97, 50};
		int[] answer = new int[2];
		
		FindMaxMin fmm = new FindMaxMin();
		
		answer = fmm.findMaxMin(iArray, 0, iArray.length - 1);
		
		System.out.println("최솟값 : " + answer[0]);
		System.out.println("최댓값 : " + answer[1]);
	}
}
