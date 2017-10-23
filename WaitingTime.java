
public class WaitingTime {
	
	public static void main(String[] args) {
		int[] tickets = {2,6,3,4,5};
//		int [] tickets = {1,1,1,1};
		
		System.out.println(waitingTime(tickets,2));
	}
	
	static long waitingTime(int[] tickets, int p) {
		long time = 0;
		int ticketsRequired = tickets[p];
		for(int i=0; i <tickets.length;i++)
		{
			if(tickets[i] <= ticketsRequired && i <= p)
				time += tickets[i] ;
			else if (tickets[i] > ticketsRequired && i < p)
				time += ticketsRequired;
			else
				time += ticketsRequired-1;
		}
		return time;
		
	}

}
