package bankCard;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		VisaCard v1 = new VisaCard(2344.43, 4432141245678331l, 2023, 11, "James Douglas");
		VisaCard v2 = new VisaCard(5435.18, 4435133322144340l, 2025, 01, "Ana Dawson");
		VisaCard v3 = new VisaCard(1024.99, 4483889900000093l, 2023, 06, "Nina Hall");
		VisaCard v4 = new VisaCard(3179.04, 4477738389990001l, 2024, 02, "George Darff");
		MasterCard m1 = new MasterCard(4193.43, 5503094930030303l, 2024, 07);
		MasterCard m2 = new MasterCard(5313.81, 5500008839300366l, 2025, 04);
		MasterCard m3 = new MasterCard(1001.57, 5511340043998473l, 2023, 10);
		MasterCard m4 = new MasterCard(5334.31, 5541299399993114l, 2024, 12);
		
		ArrayList<PaymentCard> theListOfAllTheCards = new ArrayList<>();
		theListOfAllTheCards.add(v1);
		theListOfAllTheCards.add(v2);
		theListOfAllTheCards.add(v3);
		theListOfAllTheCards.add(v4);
		theListOfAllTheCards.add(m1);
		theListOfAllTheCards.add(m2);
		theListOfAllTheCards.add(m3);
		theListOfAllTheCards.add(m4);
		
		for (int i = 0; i < theListOfAllTheCards.size(); i++) {
			theListOfAllTheCards.get(i).printDetails();
		}
		v1.executionOfTheTransaction(335.43);
		v2.executionOfTheTransaction(1043.14);
		v3.executionOfTheTransaction(233.34);
		v4.executionOfTheTransaction(743.19);
		m1.maintenance();
		m1.executionOfTheTransaction(1703.12);
		m2.maintenance();
		m2.executionOfTheTransaction(2431.43);
		m3.maintenance();
		m3.executionOfTheTransaction(183.31);
		m4.maintenance();
		m4.executionOfTheTransaction(2178.15);
		System.out.println("-----------------------------------------");
		System.out.println("Avaibable amounts after the transactions:");
		System.out.println("-----------------------------------------");
		for (int i = 0; i < theListOfAllTheCards.size(); i++) {
			theListOfAllTheCards.get(i).printDetails();
		}
	}

}
