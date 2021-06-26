package climbers;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Mountain m1 = new Mountain("Mount Everest", "Nepal", 8849);
		RecreationalClimber r1 = new RecreationalClimber(1314321, "James Smith ", 21, "North Wall", 8732);
		RecreationalClimber r2 = new RecreationalClimber(2131325, "Sonya Taylor ", 46, "Alsergrund", 6840);
		RecreationalClimber r3 = new RecreationalClimber(5123219, "Michael Wilson", 16, "South River", 6501);
		Alpinist a1 = new Alpinist(2431232, "Sandara Davies", 3);
		Alpinist a2 = new Alpinist(621332, "Tony Walker", 7);
		Alpinist a3 = new Alpinist(9943102, "Simon Brown", 6);
		
		ArrayList<Climber> arrayOfTheClimbers = new ArrayList<>();
		arrayOfTheClimbers.add(r1);
		arrayOfTheClimbers.add(r2);
		arrayOfTheClimbers.add(r3);
		arrayOfTheClimbers.add(a1);
		arrayOfTheClimbers.add(a2);
		arrayOfTheClimbers.add(a3);	
		
		int sum = 0;
		for (int i = 0; i < arrayOfTheClimbers.size(); i++) {
			sum += arrayOfTheClimbers.get(i).climberMembershipFee();
			arrayOfTheClimbers.get(i).successfulAscent(arrayOfTheClimbers.get(i));
			arrayOfTheClimbers.get(i).print();
			System.out.println("-----------------------------------------");
		}
		System.out.println("The sum of membership fees of all climbers is: " + sum);
			
		}

}
