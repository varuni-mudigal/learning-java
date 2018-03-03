
public class Conductor {
	
	Ticket giveTicket(Money m)
	{
		Ticket t=new Ticket();
		//System.out.println("Passenger has given money");
		return t;
	}
	
	public static void main(String[] args) {
		Passenger p=new Passenger();
		Money m= p.getMoney();
		Conductor c=new Conductor();
		Ticket t=c.giveTicket(m);
		System.out.println("Conductor issues ticket taking money from passenger");
		
	}

}
