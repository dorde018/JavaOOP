package reactions;

import java.util.ArrayList;


public class Post {
	private String name;
	private String surname;
	private String textOfThePost;
	private ArrayList<Reaction> reactions;
	
	public Post(String name, String surname, String textOfThePost ) {
		super();
		this.name = name;
		this.surname = surname;
		this.textOfThePost = textOfThePost;
		this.reactions = new ArrayList<Reaction>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getTextOfThePost() {
		return textOfThePost;
	}
	public void setTextOfThePost(String textOfThePost) {
		this.textOfThePost = textOfThePost;
	}
	public ArrayList<Reaction> getReactions() {
		return reactions;
	}
	public void setReactions(ArrayList<Reaction> reactions) {
		this.reactions = reactions;
	}
	public void react(Reaction reaction) {
		this.reactions.add(reaction);
	}
	
	private int countingTypesOfTheReactions(String typeOfTheReaction) {
		int counter = 0;
		for (int i = 0; i < reactions.size(); i++) {
			if(reactions.get(i).getTypeOfTheReaction().equals(typeOfTheReaction)) {
				counter++;
			}
		}
		return counter;
	}
	public void detailsOfThePost() {
		System.out.println("-------------------------------------------");
		System.out.println(this.name + " " + this.surname + "'s post:");
		System.out.println("\n" +this.textOfThePost);
		System.out.println("\nSmiles: " + countingTypesOfTheReactions("Smile") + " | Likes: " + countingTypesOfTheReactions("Like") + 
				" | Hearts: " + countingTypesOfTheReactions("Heart"));
		System.out.println("-------------------------------------------");
	}
	public void personsThatReacted(ArrayList<Reaction> listOfThePersonsThatReacted) {
		System.out.println("Persons that reacted to all the posts are:\n");
				for (int i = 0; i < listOfThePersonsThatReacted.size(); i++) {
				String name = listOfThePersonsThatReacted.get(i).getName();
				String surname = listOfThePersonsThatReacted.get(i).getSurname();
				System.out.println(i + 1 + ". " + name + " " + surname);
			}
		System.out.println("-------------------------------------------");
	}
		
	}
