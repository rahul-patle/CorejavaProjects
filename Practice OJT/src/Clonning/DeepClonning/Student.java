package Clonning.DeepClonning;

public class Student implements Cloneable {

	int id;
	Name name;

	
	public Object clone() throws CloneNotSupportedException {
// by default object clone class method gives shallow clonning
		// by this only get[id =1 name] student class object of id only
		Student studentclone = (Student) super.clone();
// to clone non primitive object call particular clone method  
		studentclone.name = (Name) name.clone(); // [] Name class object
		
		return studentclone;
	}//clone method end

	public static void main(String[] args) throws CloneNotSupportedException {
		new Name().clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}// class end

