
public class Winner {

	public static void main(String[] args) {
		
		int[] andrea = {1,2,3};
		int[] maria = {2,1,3};
		String s = "Even";
		
		System.out.println(winner(andrea,maria,s));
		System.out.println(winner(andrea,maria,"Odd"));
	}
	
	static String winner(int[] andrea,int[] maria, String s) {
		int mariaScore =0, andreaScore =0;
		
		for(int i =0; i < andrea.length;i++)
		{
			if(s.equals("Even")) {
				if(i%2 == 0) {
					andreaScore += andrea[i];
					mariaScore += maria[i];
				}
			}
			else
				if(i%2 != 0)
				{
					andreaScore += andrea[i];
					mariaScore += maria[i];
				}
		}
		
		if(mariaScore > andreaScore)
			return "Maria";
		else if (mariaScore < andreaScore)
			return "Andrea";
		else
			return "Tie";
		
	}
}
