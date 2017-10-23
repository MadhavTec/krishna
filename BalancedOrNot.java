import java.util.Stack;

public class BalancedOrNot {
	
	public static void main(String[] args) {
		
//		String[] expressions = {"<>","<>><"};
//		int[] maxReplacements = {1,0};
		String[] expressions = {"<>>>","<>>>>"};
		int[] maxReplacements = {2,2};
		int[] results = balancedOrNot(expressions,maxReplacements);
		
		for(int i :results)
			System.out.println(i);
	}
	
	static int[] balancedOrNot(String[] expressions,int[] maxReplacements) {
		
		Stack<Character> stack;
		int[] results = new int[expressions.length];
		
		for(int i=0;i < expressions.length ;i++) {
			int count=0;
			stack = new Stack<Character>();
			for(char symbol:expressions[i].toCharArray()) {
				if(symbol == '<')
					stack.push(symbol);
				else if(!stack.isEmpty())
					stack.pop();
				else
					count++;		
			}
			if(maxReplacements[i] < count +stack.size())
				results[i] = 0;
			else
			results[i]= 1;
		}
		return results;
	}

}
