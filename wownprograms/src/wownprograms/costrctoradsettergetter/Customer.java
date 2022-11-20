package wownprograms.costrctoradsettergetter;

public class Customer {

	String name;
	String location;
	String streetway;
	
	Customer (String name, String location,String streetway){
		this.name = name;
		this.location=location;
		this.streetway= streetway;
	}
	Customer (){
		
	}
	
public void setName  (String name) {
	this.name = name;
}
public String getName () {
	return name;
	
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getStreetway() {
	return streetway;
}
public void setStreetway(String streetway) {
	this.streetway = streetway;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", location=" + location + ", streetway=" + streetway + "]";
}


}
