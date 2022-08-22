package algorithm.one;

// FindMaximum(A[0 .. N-1])
// max = A[0]
// for (i=1; i<N; i++)
// 		if(A[i] > max) max = A[i]
// return max

public class FindMax {
	//static int max = 0;
	public static void main(String[] args) {
		
		FindMax fm = new FindMax();
		
		int[] arr = new int[] {20, 30, 67, 2, 94, 47};
		int max = fm.findMaximum(arr);
		
		System.out.println("최대값 : " + max);
		
	}
	
	private int findMaximum(int[] arrA) {
		int max = arrA[0]; 
		// max = arrA[0]; 	// 만약 static으로 변수를 만들면 브레이크포인트에서 보이지 않음(다른 영역에 있기 때문에)
		for (int i = 0; i < arrA.length; i++) 
			if (arrA[i] > max) max = arrA[i];
		
		return max;
	}
}


