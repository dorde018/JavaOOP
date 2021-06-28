package videoPlayer;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		VideoPlayer v1 = new VideoPlayer(1243, 200, 55, 65);
		v1.print();
		System.out.println("----------------------------------");
		
		TimeControl currentVideoTimeBackward = new TimeControl(false);
		currentVideoTimeBackward.action(v1);
		v1.print();
		System.out.println("----------------------------------");
		
		AudioControl volumeUp = new AudioControl(true);
		volumeUp.action(v1);
		v1.print();
		System.out.println("----------------------------------");
		
		QualityOptimizerControl q1 = new QualityOptimizerControl(61);
		q1.action(v1);
		v1.print();
		System.out.println("----------------------------------");
		
		
		VideoPlayer v2 = new VideoPlayer(984, 300, 47, 80);
		
		v2.print();
		System.out.println("----------------------------------");
		
		ArrayList<Control> listOfTheActions = new ArrayList<Control>();
		listOfTheActions.add(currentVideoTimeBackward);
		listOfTheActions.add(volumeUp);
		listOfTheActions.add(q1);
		
		for (int i = 0; i < listOfTheActions.size(); i++) {
			listOfTheActions.get(i).action(v2);;
		}
		v2.print();
		System.out.println("----------------------------------------");
	}

}


