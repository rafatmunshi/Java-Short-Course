
public class MemoryManagement {
	public static Integer arr[]= new Integer[100000];
	public Integer arr1[]= new Integer[100000];
	@Override
	public void finalize() {
		System.out.println("Garbage Collected");
	}
	
	public void writeToArr() {
		for(int i =0; i< 100000; i++) {
//			arr[i]=i; // gives memory leak problems
			arr1[i]=i; // doesnt give memory leak problems
		}
	}

	public static void main(String[] args) {
		Student s = new Student();
		s = null;
		Student s1 = new Student(); // this obj is going to be garbage collected as s1 points to something else
									// later on
		Student s2 = new Student();
		s1 = s2;
		//	methodCall(new Student()) // this anonymous obj is going to be gc once methodCall completes
		// finalise() and gc()
		MemoryManagement m1 = new MemoryManagement();
		MemoryManagement m2 = new MemoryManagement();
		m1 = null;
		m2 = null;
		System.gc();
		
		MemoryManagement m3 = new MemoryManagement();
		m3.writeToArr();
		m3= null;
		
		// Any resource- eg bufferedReader/bufferedWriter and dont close it- resource leak problem
	}
}
