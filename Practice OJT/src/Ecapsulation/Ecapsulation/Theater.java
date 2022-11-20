package Ecapsulation.Ecapsulation;

public class Theater {


	int noofcapacity;

	public Theater(int noofcapacity) {
		super();
		this.noofcapacity = noofcapacity;
	}

	public Theater() {
		super();
		
	}
	public void setNoofcapacity(int noofcapacity) {
		this.noofcapacity = noofcapacity;
	}
	public int getNoofcapacity() {
		return noofcapacity;
	
	}public String toString() {
		return "[noofcapacity "+noofcapacity+"]";
		
	}
	
}
