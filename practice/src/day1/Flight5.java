package day1;

public class Flight5 {
	private int id = 100;
	private String airline = "Sky";
	private String source = "Delhi";
	private String destination = "USA";
	private float fair = 100000;
	private float duration = 7;
	
	{
		System.out.println("Decalred Values");
		this.printing();
		this.id = 101;
		this.airline = "Indigo";
		this.source = "Rajahmundry";
		this.destination = "Kerala";
		this.fair = 5000;
		this.duration = 2;
		System.out.println("Instance Initializer");
		this.printing();
	}
	
	public Flight5(int id, String airline, String source, String destination, float fair, float duration) {
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fair = fair;
		this.duration = duration;
		System.out.println("From All Arguments Constructor");
	}


	public void printing() {
		System.out.println(id);
		System.out.println(airline);
		System.out.println(source);
		System.out.println(destination);
		System.out.println(fair);
		System.out.println(duration);
		System.out.println("--------------------------------------------");
	}
	
	public static void main(String[] args) {
		Flight5 flight = new Flight5(103,"Rajesh","Kakinada","USA",6500,5);
		flight.printing();
	}

}


