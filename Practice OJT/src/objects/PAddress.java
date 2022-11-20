package objects;

public class PAddress {

	private String state;
	private String city;

	PAddress(String state,String city) {
		 this.state=state;
		 this.city=city;
		 
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return "PAddress [state=" + state + ", city=" + city + "]";
	}

}
