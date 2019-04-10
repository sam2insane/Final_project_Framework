package corejava;

import Firstpackage.Computer;

public class Execution {
	public static void main (String [] args) {
		//Object creation of a Class
		Computer refVar = new Computer();
		//class name + reference variable = new Constructor
		refVar.model = "Asus";
		System.out.println(refVar.model);
		
		Computer refVar2 = new Computer (2019);
		Computer refVar3 = new Computer ("mac");
		
		System.out.println(refVar1.display)
		}
	}
