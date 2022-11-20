package Ecapsulation.Ecapsulation;
//4//

public class CustomerOrder {

	int oid ,quantity;
	String itemName;
	
	public CustomerOrder(int oid, int quantity, String itemName) {
		super();
		this.oid = oid;
		this.quantity = quantity;
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", quantity=" + quantity + ", itemName=" + itemName + "]";
	}

	
	
}
