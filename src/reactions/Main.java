package reactions;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Post p1 = new Post("Sammy", "Reinhold", "Hello World, this is my first post! :)");
		Post p2 = new Post("Michael", "Anderson", "Today is a great day to learn something new!");
		
		Reaction r1 = new Reaction("Like", "Isabela", "Herby");
		Reaction r2 = new Reaction("Smile", "Eve", "Nicolas");
		Reaction r3 = new Reaction("Heart", "Sandra", "Fallon");
		Reaction r4 = new Reaction("Heart", "John", "Sam");
		Reaction r5 = new Reaction("Smile", "Eliot", "Page");
		Reaction r6 = new Reaction("Like", "Mark", "Moore");
		Reaction r7 = new Reaction("Like", "Denn", "Thomas");
		Reaction r8 = new Reaction("Heart", "Jenny", "White");
		Reaction r9 = new Reaction("Like", "Victoria", "Davis");
		Reaction r10 = new Reaction("Smile", "Jimmy", "Miller");
		Reaction r11 = new Reaction("Smile", "Isabela", "Johnson");
		Reaction r12 = new Reaction("Like", "Chester", "Williams");
		Reaction r13 = new Reaction("Heart", "Lee", "Brown");
		Reaction r14 = new Reaction("Heart", "Miles", "Smith");
		
		p1.react(r1);
		p1.react(r2);
		p1.react(r3);
		p1.react(r4);
		p1.react(r5);
		p1.react(r6);
		p1.react(r7);
		
		for (int i = 0; i < 5; i++) {
			p1.react(r1);
			p1.react(r2);
			p1.react(r4);
			p1.react(r7);
		}
		p1.detailsOfThePost();
		
		for (int i = 0; i < 7; i++) {
			p2.react(r10);
			p2.react(r12);
			p2.react(r13);
		}
		p2.react(r8);
		p2.react(r9);
		p2.react(r10);
		p2.react(r11);
		p2.react(r12);
		p2.react(r13);
		p2.react(r14);
		
		p2.detailsOfThePost();
		
		ArrayList<Reaction> listOfThePersonsThatReactedToThePosts = new ArrayList<>();
		listOfThePersonsThatReactedToThePosts.add(r1);
		listOfThePersonsThatReactedToThePosts.add(r2);
		listOfThePersonsThatReactedToThePosts.add(r3);
		listOfThePersonsThatReactedToThePosts.add(r4);
		listOfThePersonsThatReactedToThePosts.add(r5);
		listOfThePersonsThatReactedToThePosts.add(r6);
		listOfThePersonsThatReactedToThePosts.add(r7);
		listOfThePersonsThatReactedToThePosts.add(r8);
		listOfThePersonsThatReactedToThePosts.add(r9);
		listOfThePersonsThatReactedToThePosts.add(r10);
		listOfThePersonsThatReactedToThePosts.add(r11);
		listOfThePersonsThatReactedToThePosts.add(r12);
		listOfThePersonsThatReactedToThePosts.add(r13);
		listOfThePersonsThatReactedToThePosts.add(r14);
		
		p1.personsThatReacted(listOfThePersonsThatReactedToThePosts);	
		
	}

}
