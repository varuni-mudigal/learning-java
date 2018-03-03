public class Passenger {
	void takeTicket()
	{
		Money m=new Money();
		Conductor c=new Conductor();
		Ticket tk=c.giveTicket();
		System.out.println("Passenger has taken ticket");
	}
	public static void main(String[] args) {
		Passenger p=new Passenger();
		p.takeTicket();
	}
}
