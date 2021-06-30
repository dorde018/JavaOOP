package zoomCall;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Guest h1 = new Guest("John Tapper", "Basic");
		Guest g1 = new Guest("Isabel McSale", "Pro");
		ZoomCall c1 = new ZoomCall("https://link.meeting/room1", "room1202", h1, g1);
		
		Guest h2 = new Guest("Sandra Nelson", "Premium");
		Guest g2 = new Guest("Michael Tailor", "Pro");
		ZoomCall c2 = new ZoomCall("https://link.meeting/room2", "room2202", h2, g2);
		
		Guest h3 = new Guest("Anderson McFee", "Basic");
		Guest g3 = new Guest("Martin Gallor", "Pro");
		ZoomCall c3 =  new ZoomCall("https://link.meeting/room3", "room3202", h3, g3);
		
		Guest h4 = new Guest("Anthony Males", "Pro");
		Guest g4 = new Guest("Mia James", "Pro");
		ZoomCall c4 = new ZoomCall("https://link.meeting/room4", "room3203", h4, g4);
		
		ArrayList<ZoomCall> theListOfTheZoomCalls = new ArrayList<>();
		theListOfTheZoomCalls.add(c1);
		theListOfTheZoomCalls.add(c2);
		theListOfTheZoomCalls.add(c3);
		theListOfTheZoomCalls.add(c4);
		
		for (int i = 0; i < theListOfTheZoomCalls.size(); i++) {
				theListOfTheZoomCalls.get(i).startCall();		
		} 
		
		h1.subscribe(100);
		g1.cancel();
		h2.cancel();
		g2.subscribe(150);
		h3.subscribe(100);
		g3.cancel();
		h4.subscribe(150);
		h4.cancel();
		
		System.out.println("-------------------------------------------");
		System.out.println("Zoom calls after the actions were performed");
		System.out.println("-------------------------------------------");
		
		for (int i = 0; i < theListOfTheZoomCalls.size(); i++) {
			theListOfTheZoomCalls.get(i).startCall();
		} 
	
	}
}
