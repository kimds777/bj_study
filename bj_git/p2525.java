package bj_git;

import java.util.Scanner;

public class p2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		sc.close();
		
		int tm = 60*h+m;
		tm += o;
		
		System.out.printf("%d %d",(tm/60)%24,tm%60);
	}
}
