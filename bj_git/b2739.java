package bj_git;

import java.util.Scanner;

public class b2739 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		in.close();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}
	}
}
