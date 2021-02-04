
public class Static {
public static void main(String[] args) {
	Integer count=0;
	Attendance student1= new Attendance("Java");
	Attendance student2= new Attendance("Java");
	Attendance student3= new Attendance();
	System.out.println(Attendance.getAttendanceCount());
}
}

class Attendance{
	// static - common for all the instances/objects
	// static associated with the class and not with specific objects
static public Integer studentCount=0;
// non static- associated with each object
public String className;
//default constructor
Attendance(){
	studentCount++;
}
//parameterised constructor
Attendance(Integer count, String className){
	this(className);
	studentCount= count;
}
// constructor communication
Attendance(String className){
	studentCount++;
	this.className= className;
}
// copy constructor
Attendance(Attendance a){
	studentCount= a.studentCount;
	this.className= a.className;
}

public static Integer getAttendanceCount() {
	return studentCount;
}
public Integer getStudentCount() {
	return studentCount;
}
public void setStudentCount(Integer count) {
	studentCount = count;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}

}
