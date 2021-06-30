package zoomCall;

public class ZoomCall  {
	private String url;
	private String password;
	private Guest host;
	private Guest guest;
	public ZoomCall(String url, String password, Guest host, Guest guest) {
		super();
		this.url = url;
		this.password = password;
		this.host = host;
		this.guest = guest;
	}
	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public String getUrl() {
		return url;
	}

	public String getPassword() {
		return password;
	}

	public Guest getHost() {
		return host;
	}

	public void startCall() {
		System.out.println("-------------------------------------------");
		System.out.println("Zoom call: " + this.url + "\nPassword: " + this.password);
		System.out.println("Host: " );
		this.host.printDetails();
		System.out.println("Guest: ");
		this.guest.printDetails();
		System.out.println("The maximum call duration is: " +  this.host.theMaximumCallDuration() + " minutes.");
		System.out.println("-------------------------------------------");
	}

}	

