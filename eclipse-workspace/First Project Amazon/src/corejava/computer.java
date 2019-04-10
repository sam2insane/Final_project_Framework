package corejava;

public class computer {
	
	int year;
	String model;
	String Display = "15 inch";
	

	public computer () {
}
	
	
	public computer (int year) {
		this.year=year;
		System.out.println(year);
	}
	public computer(String model) {
		this.model=model;
		System.out.println(model);
	}
	
	
}
