import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Vehicle[] totalVehicles = null;
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		//Vehicle a = new Truck(); works
		//Vehicle b = new Car(); works
		//Vehicle c = new Vehicle(); works
		//Car d = new Car(); works
		//Truck e = new Truck(); works
		//Car f = new Vehicle(); won't compile
		//Car g = new Truck(); won't compile
		//Truck h = new Car(); won't compile
		//Truck i = new Vehicle(); won't compile
		Scanner s = new Scanner(System.in); 
		for(;;) {
			System.out.println("Type \"1\" to create a new vehicle\n"
					+ "Type \"2\" to start a vehicle\n"
					+ "Type \"3\" to stop a vehicle\n"
					+ "Type \"4\" to turn a vehicle\n"
					+ "Type \"5\" to increase speed of a vehicle\n"
					+ "Type \"6\" to decrease speed of a vehicle");
			int num = s.nextInt();
			if(num == 1) {
				System.out.println("Do want to create a new vehicle, car or truck?");
				String select = s.next();
				if(select.equals("vehicle")) {
					list.add(Vehicle.readFromInput());
					totalVehicles = list.toArray(new Vehicle[list.size()]);
				} else if(select.equals("car")) {
					list.add(Car.readFromInput());
					totalVehicles = list.toArray(new Car[list.size()]);
				} else if(select.equals("truck")) {
					list.add(Truck.readFromInput());
					totalVehicles = list.toArray(new Truck[list.size()]);
				} else {
					System.out.println("Not an option");
				}
			} else if (num == 2) {
				
			}
		}
		
	}
}
