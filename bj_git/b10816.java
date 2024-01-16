package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Counting Sort 활용! -> 944ms
		int[] arr = new int[20000001]; // 숫자 카드의 범위가 -10,000,000 ~ 10,000,000이므로 0까지 포함해서 20,000,001로 설정

		int N = Integer.parseInt(br.readLine()); // 상근이가 가지고있는 카드 갯수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (N-- > 0) {
			int index = Integer.parseInt(st.nextToken()) + 10000000; // 카드가 음수일 수 있으니 10,000,000을 다 더해준다.
			arr[index]++;
		}

		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		while (M-- > 0) { // M개의 정수 카드를 index로 설정하여 arr의 값을 sb에 넣는다.
			int index = Integer.parseInt(st.nextToken()) + 10000000;
			sb.append(arr[index] + " "); 
		}

//		Map 활용! -> 1200ms
//		br.readLine();
//		String[] nArr = br.readLine().split(" ");
//
//		br.readLine();
//		String[] mArr = br.readLine().split(" ");
//
//		Map<String, Integer> mCheck = new HashMap<>();
//		for (String m : mArr) {
//			mCheck.put(m, 0);
//		}
//
//		for (String n : nArr) {
//			if (mCheck.containsKey(n)) {
//				mCheck.replace(n, mCheck.get(n) + 1);
//			}
//		}
//
//		StringBuilder sb = new StringBuilder();
//		for (String m : mArr) {
//			sb.append(mCheck.get(m)+" ");
//		}
//		
		System.out.println(sb);
	}
}
