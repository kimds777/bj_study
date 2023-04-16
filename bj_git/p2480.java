package bj_git;

import java.util.Scanner;

public class p2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result;
		
		if(a==b&&b==c) {
			result = 10000+a*1000;
		}else if(a==b) {
			result = 1000+a*100;
		}else if(b==c) {
			result = 1000+b*100;
		}else if(a==c) {
			result = 1000+a*100;
		}else {
			result = a>b&&a>c ? a*100 : b>a&&b>c ? b*100 : c*100;
		}
		System.out.println(result);
	}
}
