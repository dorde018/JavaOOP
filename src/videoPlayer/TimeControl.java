package videoPlayer;
/*Kreirati klasu TimeControl koja nasledjuje klasu Control i
●implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. 
Veoma je bitno dase ne izadje van granica videa.*/
public class TimeControl extends Control{
	private boolean currentVideoTimeForward;

	public TimeControl(boolean currentVideoTimeForward) {
		super();
		this.currentVideoTimeForward = currentVideoTimeForward;
	}

	public boolean isCurrentVideoTimeForward() {
		return currentVideoTimeForward;
	}

	public void setCurrentVideoTimeForward(boolean currentVideoTimeForward) {
		this.currentVideoTimeForward = currentVideoTimeForward;
	}

	@Override
	public void action(VideoPlayer action) {
		if(currentVideoTimeForward) {
			if(action.getCurrentVideoTime() + 15 > action.getVideoLength()) 
				action.setCurrentVideoTime(action.getCurrentVideoTime());
			else {
				action.setCurrentVideoTime(action.getCurrentVideoTime() + 15);
				}

		}else {
				if(action.getCurrentVideoTime() - 15 < 0)
				action.setCurrentVideoTime(0);
			else {
				action.setCurrentVideoTime(action.getCurrentVideoTime() - 15);
			}	
		}
	}
}


	
