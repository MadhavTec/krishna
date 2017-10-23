
public class Future {

	public static void main(String[] args) {

		System.out.println(minNum(3, 5, 1));
		System.out.println(minNum(4, 5, 1));
	}

	static int minNum(int A, int K, int P) {
		int result = 0;
		if (K < A)
			result = -1;
		else
			for (; (result * A) + P >= K * result;result++)
				;

		return result;
	}
}
