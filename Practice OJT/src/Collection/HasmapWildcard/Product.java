package Collection.HasmapWildcard;

import java.util.Objects;
import java.util.Random;

public class Product {
	Integer pid ;
	Integer pprice;
	String  pname;
	public Product(Integer pid, Integer pprice, String pname) {
		super();
		this.pid = pid;
		this.pprice = pprice;
		this.pname = pname;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getPprice() {
		return pprice;
	}
	public void setPprice(Integer pprice) {
		this.pprice = pprice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pprice=" + pprice + ", pname=" + pname + "]";
	}
	
//	@Override
//	public int hashCode() {
//		return new Random().nextInt();
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(pid, pname, pprice);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(pid, other.pid) && Objects.equals(pname, other.pname)
				&& Objects.equals(pprice, other.pprice);
	}
	
}

