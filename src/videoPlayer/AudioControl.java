package videoPlayer;

public class AudioControl extends Control {
	private boolean volumeUp;

	public AudioControl(boolean volumeUp) {
		super();
		this.volumeUp = volumeUp;
	}
	
	public boolean isVolumeUp() {
		return volumeUp;
	}

	public void setVolumeUp(boolean volumeUp) {
		this.volumeUp = volumeUp;
	}

	@Override
	public void action(VideoPlayer action) {
		if(volumeUp) {
			if(action.getAudioVolume() < 100) {
				action.setAudioVolume(action.getAudioVolume() + 1);
			}
    	}else {
		if (action.getAudioVolume() > 0) {
			action.setAudioVolume(action.getAudioVolume() - 1);
		}
	}		
}

}

