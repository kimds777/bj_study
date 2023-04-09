package bj_git;

import java.util.Scanner;

public class b1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) System.out.println(">");
		else if(b>a) System.out.println("<");
		else System.out.println("==");		
		sc.close();
	}
}
