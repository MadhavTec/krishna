
public class Circles {

	public static void main(String[] args) {

		String[] input1 = { "0 5 9 0 9 7", "0 15 11 0 20 16", "26 0 10 39 0 23", "37 0 5 30 0 11", "41 0 0 28 0 13" };
		String[] input2 = { "12 0 21 14 0 23", "0 45 8 0 94 9", "35 0 13 10 0 38", "0 26 8 0 9 25" };
		for (String out : circles(input1))
			System.out.println(out);

		for (String out : circles(input2))
			System.out.println(out);
	}

	static String[] circles(String[] info) {
		String[] results = new String[info.length];
		for (int i = 0; i < info.length; i++) {
			String[] circleDetails = info[i].split(" ");
			int Xa = Integer.valueOf(circleDetails[0]);
			int Ya = Integer.valueOf(circleDetails[1]);
			int Ra = Integer.valueOf(circleDetails[2]);
			int Xb = Integer.valueOf(circleDetails[3]);
			int Yb = Integer.valueOf(circleDetails[4]);
			int Rb = Integer.valueOf(circleDetails[5]);

			if (Xa == Ya && Xb == Yb)
				results[i] = "Concentric";
			else {
				int distance = Math.abs(Xa - Xb + Ya - Yb);
				int radDistance = Math.abs(Ra - Rb);
				if (distance == radDistance)
					results[i] = "Touching";
				else if (distance < radDistance)
					results[i] = "Disjoint-Inside";
				else if (distance > Ra + Rb)
					results[i] = "Disjoint-Outside";
				else
					results[i] = "Intersecting";
			}
		}
		return results;

	}

}
