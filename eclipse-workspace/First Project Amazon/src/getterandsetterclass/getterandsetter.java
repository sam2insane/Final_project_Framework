package getterandsetterclass;

public class getterandsetter {
	String name;
	String date;
	int ID;
	public getterandsetter(String name, String date, int iD) {
		super();
		this.name = name;
		this.date = date;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
