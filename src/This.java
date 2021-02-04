
public class This {
public static void main(String[] args) {
	ClassRoom c= new ClassRoom("Java");
	ClassRoom c1= new ClassRoom();
	c1= c.assignToOther();
	System.out.println(c1.getClassName());
	Integer scopeTest= 1;
}
}
class ClassRoom{
static public Integer studentCount=0;

public String className;

ClassRoom(){
	studentCount++;
}

public ClassRoom assignToOther() {
	
	return this;
}

ClassRoom(Integer count, String className){
	this(className);
	studentCount= count;
}

ClassRoom(String className){
	studentCount++;
	this.className= className;
}

ClassRoom(Attendance a){
	studentCount= a.studentCount;
	this.className= a.className;
}
public String getClassName (ClassRoom a) {
	return a.className;
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
	return getClassName(this);
}
public void setClassName(String className) {
	this.className = className;
}

}