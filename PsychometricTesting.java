
public class PsychometricTesting {

	public static void main(String[] args) {
		int[] scores = {4,8,7};
		int[] lowerLimits = {2,4};
		int[] upperLimits = {8,4};
		
		for(int i : jobOffers(scores,lowerLimits,upperLimits))
			System.out.println(i);

	}

	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {

		int[] offers = new int[lowerLimits.length];
		int count = 0;

		for (int i = 0; i < lowerLimits.length; i++) {
			count = 0;
			for (int score : scores) {
				if (score <= upperLimits[i] && score >= lowerLimits[i])
					count++;
			}
			offers[i] = count;
		}
		return offers;
	}

}
