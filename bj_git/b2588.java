package bj_git;

import java.util.Scanner;

public class b2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = String.valueOf(sc.nextInt());
		char[] ba = b.toCharArray();
		sc.close();
		
		System.out.println(a*(ba[2]-'0'));
		System.out.println(a*(ba[1]-'0'));
		System.out.println(a*(ba[0]-'0'));
		System.out.println(a*Integer.valueOf(b));
	}
}
