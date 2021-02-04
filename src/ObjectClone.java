
public class ObjectClone implements Cloneable {
	int id;
	String name;

	public ObjectClone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ObjectClone() {
		super();
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		ObjectClone obj = new ObjectClone(1, "name1");
		ObjectClone obj1 = new ObjectClone();
		try {
			obj1 = (ObjectClone) obj.clone();
			obj1.id = 2;
			System.out.println(obj.id);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
