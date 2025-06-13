package day1;

public class Flight1 {
	private int id;
	private String airline;
	private String source;
	private String destination;
	private float fair;
	private float duration;
	public Flight1() {
		super();
		System.out.println("Default Constructor");
	}
	

	public static void main(String[] args) {
		Flight1 flight=new Flight1();
		System.out.println(flight.id);
		System.out.println(flight.airline);
		System.out.println(flight.source);
		System.out.println(flight.destination);
		System.out.println(flight.fair);
		System.out.println(flight.duration);
	}
}
