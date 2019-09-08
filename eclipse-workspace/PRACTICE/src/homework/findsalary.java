package homework;
import java.util.Scanner;
public class findsalary {
	public static void main (String [] args) {
		
		
		
				int A = 20;
				
		
		
				Scanner type = new Scanner(System.in);
				System.out.print("what is your name");
				String name = type.nextLine();
				
				
				System.out.print(name + " ,what year is your car from = ");
				double CY = type.nextDouble();
				
				
				System.out.print(name + ", the mileage of the car = ");
				double MG = type.nextDouble();
				
				double B = MG/A ;
				
				
				System.out.print("would you like to find out the value of your car");
				System.out.println("if yes = 1 and if no = 2 ");
				double yn = type.nextDouble();
				
				if (yn == 1) {
				System.out.println(B);
				} else {
					System.out.println("Have a nice day");
				}
				
						
				
				
	
						
	}

}
