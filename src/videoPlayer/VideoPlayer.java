package videoPlayer;

public class VideoPlayer {
	private int videoLength;
	private double currentVideoTime;
	private int audioVolume;
	private int videoQuality;
	public VideoPlayer(int videoLength, double currentVideoTime, int audioVolume, int videoQuality) {
		super();
		this.videoLength = videoLength;
		this.currentVideoTime = currentVideoTime;
		this.audioVolume = audioVolume;
		this.videoQuality = videoQuality;
	}
	public int getVideoLength() {
		return videoLength;
	}
	public void setVideoLength(int videoLength) {
		this.videoLength = videoLength;
	}
	public double getCurrentVideoTime() {
		return currentVideoTime;
	}
	public void setCurrentVideoTime(double currentVideoTime) {
		this.currentVideoTime = currentVideoTime;
	}
	public int getAudioVolume() {
		return audioVolume;
	}
	public void setAudioVolume(int audioVolume) {
		this.audioVolume = audioVolume;
	}
	public int getVideoQuality() {
		return videoQuality;
	}
	public void setVideoQuality(int videoQuality) {
		this.videoQuality = videoQuality;
	}
	public void print() {
		System.out.println("Current video time: " + this.currentVideoTime +" seconds."+"\nAudio volume: " 
							+ this.audioVolume + "\nQuality of the video: " + this.videoQuality);
	}
	
}
