package naren;

public class Passenger {

	float money;
	Ticket ticket;

	/**
	 * @return the money
	 */
	public float getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(float money) {
		this.money = money;
	}
	
	

	
	/**
	 * @return the ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public static void main(String[] args) {
		Conductor conductor = new Conductor();
		Passenger passenger = new Passenger(); 
		
		passenger.setMoney(20.0F);
		float moneyFromPassenger = passenger.getMoney();
		System.out.println( "Money from Passenger " + moneyFromPassenger);
		Ticket ticketIssuedByConductor = conductor.issueTicket(moneyFromPassenger);
		passenger.setTicket(ticketIssuedByConductor);
		
	}
}
