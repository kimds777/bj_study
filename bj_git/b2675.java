package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b2675 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int testCase = Integer.parseInt(br.readLine());
//
//		StringTokenizer st;
//		for (int i = 0; i < testCase; i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			int repeat = Integer.parseInt(st.nextToken());
//			char[] str = st.nextToken().toCharArray();
//
//			for (int j = 0; j < str.length; j++) {
//				for (int r = 0; r < repeat; r++) {
//					System.out.print(str[j]);
//				}
//			}
//			System.out.println();
//		}		
//		br.close();
//	}
	
//	StringBuilder 사용!	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testCase; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int repeat = Integer.parseInt(st.nextToken());
			char[] str = st.nextToken().toCharArray();

			for (int j = 0; j < str.length; j++) {
				for (int r = 0; r < repeat; r++) {
					sb.append(str[j]);
				}
			}
			sb.append("\n");
		}		
		br.close();
		System.out.println(sb.toString());
	}
}
