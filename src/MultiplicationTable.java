import java.util.Scanner;

/*
Create a Program to display multiplication table from 1 to x. The tables should be displayed as-
Multiplication table for 1
1 x 1 = 1
....
Multiplication table for 2
....
Multiplication table for 3
....
*/
public class MultiplicationTable {
public static void main(String[] args) {
	System.out.println("Please input the number till where you need the multiplication tables");
	Scanner sc= new Scanner(System.in);
	Integer x= sc.nextInt();
	for(int j=1; j<=x; j++) {
		System.out.println("Multiplication table for "+j);
		for(int i=1; i<=10; i++) {
			System.out.println(j+" x "+i+" = "+j*i);
		}
	}
}
}
