package day1;

public class Flight3 {
	private int id;
	private String airline;
	private String source;
	private String destination;
	private float fair;
	private float duration;
	
	
	public Flight3(int id, String airline, String source, String destination, float fair, float duration) {
		this();
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fair = fair;
		this.duration = duration;
		System.out.println("From All Arguments Constructor");
	}


	public Flight3() {
		super();
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
		Flight3 flight = new Flight3(103,"Rajesh","Kakinada","USA",6500,5	);
		flight.printing();
	}

}
