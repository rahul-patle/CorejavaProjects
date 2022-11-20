package Collection.StreamApi;

public class Hospital {
	int hid;
	String Patientname;
	String Disease;
	public Hospital(int hid, String patientname, String disease) {
		super();
		this.hid = hid;
		Patientname = patientname;
		Disease = disease;
	}
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getPatientname() {
		return Patientname;
	}
	public void setPatientname(String patientname) {
		Patientname = patientname;
	}
	public String getDisease() {
		return Disease;
	}
	public void setDisease(String disease) {
		Disease = disease;
	}
	@Override
	public String toString() {
		return "Hospital [hid=" + hid + ", Patientname=" + Patientname + ", Disease=" + Disease + "]";
	}
	
}
