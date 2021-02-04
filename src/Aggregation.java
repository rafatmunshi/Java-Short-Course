
public class Aggregation {
public static void main(String[] args) {
	
}
}
// Association- one to one, one to many, many to one, many to many
//many to one
class Student{
	
	Department d;
}
class Department{
	Student [] students; 
}
class Institute{
	Department [] depts;
}

