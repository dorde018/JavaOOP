package zoomCall;

public class Guest {
	private String nameAndSurname;
	private String licenseType;
	public Guest(String nameAndSurname, String licenseType) {
		super();
		this.nameAndSurname = nameAndSurname;
		this.licenseType = licenseType;
	}
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public String getLicenseType() {
		return licenseType;
	}
	public void printDetails() {
		System.out.println(this.nameAndSurname);
	}
	public void cancel() {
		this.licenseType = "Basic";
	}
	public int theMaximumCallDuration() {
		int  theMaximumCallDuration = 0;
		if(this.licenseType.equals("Basic")) {
			 theMaximumCallDuration = 40;
		}else if (this.licenseType.equals("Pro")) {
			 theMaximumCallDuration = 240;
		}else {
			 theMaximumCallDuration = 1440;
		}
		return  theMaximumCallDuration;		
	}
	public void subscribe(int payment) {
		if(payment == 100) {
			this.licenseType = "Pro";
		}else if (payment == 150) {
			this.licenseType = "Premium";
		}
	}

	
}
