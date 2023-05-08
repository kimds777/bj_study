package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int byteInt = Integer.parseInt(br.readLine());
		br.close();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<byteInt/4; i++) {
			sb.append("long ");
		}
		sb.append("int");
		System.out.println(sb.toString());
	}
}

//import java.util.Scanner;
//
//public class p25314 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int byteInt = sc.nextInt();
//		sc.close();
//		for (int i = 0; i < byteInt / 4; i++) {
//			System.out.print("long ");
//		}
//		System.out.println("int");
//
//	}
//}
