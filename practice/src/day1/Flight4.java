package day1;

public class Flight4 {
	private int id = 100;
	private String airline = "Sky";
	private String source = "Delhi";
	private String destination = "USA";
	private float fair = 100000;
	private float duration = 7;
	
	
	public Flight4(int id, String airline, String source, String destination, float fair, float duration) {
		this();
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fair = fair;
		this.duration = duration;
		System.out.println("From All Arguments Constructor");
	}


	public Flight4() {
		super();
		System.out.println("Declaration Values");
		this.printing();
		this.id=108;
		this.airline="Sai";
		this.source="Kerala";
		this.destination="Bengaluru";
		this.fair=3500;
		this.duration=2.5f;
		System.out.println("From Default Constructor");
		this.printing();
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
		Flight4 flight = new Flight4(103,"Rajesh","Kakinada","USA",6500,5);
		flight.printing();
	}

}

