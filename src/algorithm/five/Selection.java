package algorithm.five;

public class Selection {

	public static int partition(int S[], int first, int last) {
		int i, j, temp;
		
		i = first + 1;
		j = last;
		
		while(i <= j) {
			if(S[i] <= S[first]) i = i + 1;
			else if(S[j] > S[first]) j = j - 1;
			else {
				temp = S[i];
				S[i] = S[j];
				S[j] = temp;
				i = i + 1;
				j = j - 1;
			}
		}
		
		temp = S[first];
		S[first] = S[j];
		S[j] = temp;
		
		return j;
	}
	
	public static int selection(int[] A, int first, int last, int k) {
		int p, S;
		
		p = partition(A, first, last);
		
		S = (p - 1) - first + 1;
		
		if(k <= S)
			return selection(A, first, p - 1, k);
		else if(k == S + 1) return A[p];
		else
			return selection(A, p + 1, last, k - S - 1);
	}
	
	public static void main(String[] args) {
		int A[] = {48, 12, 70, 38, 75, 67, 96, 52, 81};
		int k = 5;
		
		System.out.println(k + "번째로 작은 요소 : " + selection(A, 0, A.length - 1, k));
	}
}
