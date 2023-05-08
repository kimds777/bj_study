package bj_git;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int testCount = 0; testCount < testCase; testCount++) {
			char[] sum = br.readLine().toCharArray();
			sb.append("Case #"+(testCount+1)+": ").append((int)(sum[0]+sum[2]-96)).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class p11021 {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int testCase = Integer.parseInt(br.readLine());
//		for (int testCount = 0; testCount < testCase; testCount++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int firstNum = Integer.parseInt(st.nextToken());
//			int secondNum = Integer.parseInt(st.nextToken());
//			System.out.printf("Case #%d: %d\n", testCount+1, firstNum + secondNum);
//		}
//		br.close();
//	}
//}
