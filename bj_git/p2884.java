package bj_git;

import java.util.Scanner;

public class p2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		if(m<45) {
			h--;
			m+=15;
			if(h<0) {
				h=23;
			}
		}else {
			m-=45;
		}
		
		System.out.println(h+" "+m);
	}
}
