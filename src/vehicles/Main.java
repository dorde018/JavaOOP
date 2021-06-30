package vehicles;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bus b1 = new Bus(4, 3, "GF 24131331 AT", "School bus", 24);
		Bus b2 = new Bus(6, 5, "SM 21413009 LR", "City bus", 29);
		Bus b3 = new Bus(6, 7, "KK 83841810 DA", "Tour bus", 56);
		Bus b4 = new Bus(4, 3, "FR 53242133 DE", "Suburban bus", 30);
		
		Truck t1 = new Truck(8, 3, "HB 421312323 RR", "Dump truck", "C", 1);
		Truck t2 = new Truck(6, 2, "CL 304930098 SN", "Tractor unit", "CE", 0);
		Truck t3 = new Truck(8, 2, "LL 421312930 DB", "Tractor trailer", "CE", 1);
		Truck t4 = new Truck(6, 2, "RW 778399031 HN", "Car transporter", "CE", 1);
		
		RefrigeratorTruck r1 = new RefrigeratorTruck(14, 2, "FF 2313304993 OR", -20, 20);
		RefrigeratorTruck r2 = new RefrigeratorTruck(12, 3, "GT 2314199300 BH", -19, 18);
		RefrigeratorTruck r3 = new RefrigeratorTruck(10, 2, "FL 7839203093 GR", -21, 16);
		RefrigeratorTruck r4 = new RefrigeratorTruck(16, 2, "HT 5093903932 LN", -20, 22);
		
		ArrayList<Vehicle> theListOfTheVehicles = new ArrayList<>();
		theListOfTheVehicles.add(b1);
		theListOfTheVehicles.add(b2);
		theListOfTheVehicles.add(b3);
		theListOfTheVehicles.add(b4);
		theListOfTheVehicles.add(t1);
		theListOfTheVehicles.add(t2);
		theListOfTheVehicles.add(t3);
		theListOfTheVehicles.add(t4);
		theListOfTheVehicles.add(r1);
		theListOfTheVehicles.add(r2);
		theListOfTheVehicles.add(r3);
		theListOfTheVehicles.add(r4);
		
		for (int i = 0; i < theListOfTheVehicles.size(); i++) {
			theListOfTheVehicles.get(i).vehicleDetails();
		}
		
	}

}
