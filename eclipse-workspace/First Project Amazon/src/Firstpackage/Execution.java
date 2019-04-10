package Firstpackage;

public class Execution {
	public static void main (String [] args) {
		//Object creation of a Class
		Computer refVar = new Computer();
		//class name + reference variable = new Constructor
		refVar.model = "Asus";
		System.out.println(refVar.model);
		
		Computer refVar2 = new Computer (2019);
		Computer refVar3 = new Computer ("mac");
		
		
		
		System.out.println(refVar.display);
		
		System.out.println(Computer.keys);
		
		//Method
		Method method = new Method ();
		int newValue = method.calculator1(7,8);
		System.out.println(newValue);
	
		int nvalue = method.calculator2(2, 1); 
		System.out.println(nvalue);
	
	
	}
}