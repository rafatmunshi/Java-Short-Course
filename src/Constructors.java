
public class Constructors {

	public static void main(String[] args) {
		Attendanc enterJava= new Attendanc(1, "Java");
// anonymous object
		var anonymousObj= new Object() {
			String subject= enterJava.className;
		};
		System.out.println(anonymousObj.subject);
		Attendanc enterJava1= new Attendanc(enterJava);
//		System.out.println(enterJava.studentCount);
//		System.out.println(enterJava.className);
	}
}

class Attendanc{
public Integer studentCount;
public String className;
//default constructor
Attendanc(){
	studentCount=1;
}
//parameterised constructor
Attendanc(Integer count, String className){
	this(className);
	studentCount= count;
}
// constructor communication
Attendanc(String className){
	this.className= className;
}
// copy constructor
Attendanc(Attendanc a){
	this.studentCount= a.studentCount;
	this.className= a.className;
}
//initialiser block
{
studentCount=0;
}
public Integer getStudentCount() {
	return studentCount;
}
public void setStudentCount(Integer studentCount) {
	this.studentCount = studentCount;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}

}
