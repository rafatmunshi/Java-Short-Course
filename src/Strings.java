
public class Strings {
public static void main(String[] args) {
	char arr[]= {'a','b','c','d'};
	
	String str="abcd";
//	for(int i=0; i<arr.length; i++) {
//		System.out.print(arr[i]);
//	}
	String str1= new String();
	str1="efgh";
	String str2= new String(arr);
	System.out.println(arr[4]);
	StringBuffer strb= new StringBuffer("xyz");
	strb.append("123");
	System.out.println(strb);
}
}
