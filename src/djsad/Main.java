package djsad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		while (T > 0) {

			String[] parts = br.readLine().split(" ");
			System.out.println(search(parts));
			T--;
		}

	}

	public static String search(String[] A) {
		return search(A, 0, A.length - 1);
	}

	private static String search(String[] A, int i, int j) {
		int mid = (i+j) / 2;
	
		
		if (mid == 0||mid==j) {
				return A[mid];
		}else if (!A[mid].equals(A[mid + 1]) && !A[mid].equals(A[mid - 1])) {
			return A[mid];
		}
		
		
		if (mid % 2 == 0) {
			if (A[mid].equals(A[mid+1])) {
				return search(A, mid + 1, j);
			} else {
				return search(A, i, mid - 1);
			}
		} else {
			if (!A[mid].equals(A[mid+1])) {
				return search(A, mid + 1, j);
			} else {
				return search(A, i, mid - 1);
			}
		}

	}
}


