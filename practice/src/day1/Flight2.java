package day1;

public class Flight2 {
	private int id;
	private String airline;
	private String source;
	private String destination;
	private float fair;
	private float duration;
	
	
	public Flight2(int id, String airline, String source, String destination, float fair, float duration) {
		super();
		this.id = id;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.fair = fair;
		this.duration = duration;
	}


	public Flight2() {
		super();
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
	Flight2 flight=new Flight2();
	flight.printing();
	Flight2 flight1=new Flight2(101,"Indigo","Bengaluru","New Delhi",6500,3.4f);
	flight1.printing();
	}

}
