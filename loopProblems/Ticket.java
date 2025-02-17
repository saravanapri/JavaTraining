package loopProblems;

public class Ticket {

	public static void main(String[] args) 
	{
		int ticketprice=bestprice();
		System.out.print(ticketprice);
	}
	public static int bestprice()
	{
		int ticketprice=500;
		int  prevprofit=0;
		int attendee=120;
		int bestprice=0;
		ticketprice=ticketprice-10;
		attendee=attendee+15;
		int profit=(ticketprice*attendee)-(18000 + attendee*4);
		//System.out.println(profit+" "+ticketprice);
		while(profit>=prevprofit)
		{
			ticketprice=ticketprice-10;
			attendee=attendee+15;
			profit=(ticketprice*attendee)-(18000 + attendee*4);
			bestprice=ticketprice;
			prevprofit=profit;
		}
		return bestprice;
	}

}
