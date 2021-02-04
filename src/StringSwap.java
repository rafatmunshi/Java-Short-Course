
public class StringSwap {
public static void main(String[] args) {
	String str1= "Hi";
	String str2= "Hello";
	swap(str1,str2);
}

private static void swap(String str1, String str2) {
	String temp = new String("");
	temp= str1;
	str1= str2;
	str2= temp;
	System.out.println(str1);
	System.out.println(str2);
}
}
