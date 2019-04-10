package oop;

public class TestCar {
	public static void main(String [] args) {
		ConcreateCar concreateCar = new ConcreateCar();
		concreateCar.move();
		concreateCar.stop();
		concreateCar.start();
		concreateCar.light();
		
		BMW bmw= new BMW();
		bmw.method1();
	}

}
