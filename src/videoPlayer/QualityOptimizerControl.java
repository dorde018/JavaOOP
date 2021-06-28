package videoPlayer;

public class QualityOptimizerControl extends Control {
	private double internetSpeed;

	public QualityOptimizerControl(double internetSpeed) {
		super();
		this.internetSpeed = internetSpeed;
	}

	public double getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(double internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	@Override
	public void action(VideoPlayer action) {
		action.setVideoQuality(this.calculateQuality(this.internetSpeed));
		
	}
	public int calculateQuality(double internetSpeed) {
		double a = internetSpeed * 10.1;
		int quality = 0;
		if(a <= 144) {
			quality = 144;
		}else if(a < 240) {
			quality = 240;
		}else if(a < 360) {
			quality = 360;
		}else if(a < 480) {
			quality = 480;
		}else if(a < 720) {
			quality = 720;
		}else {
			quality = 1080;
		}
		
		return quality;
	
	}
	
}
