package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b10807 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int intNum = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] ints = new int[intNum];
		
		for (int i = 0; i < intNum; i++) {
			ints[i] = Integer.parseInt(st.nextToken());
		}
		
		int countNum = Integer.parseInt(br.readLine());

		for (int check = 0; check < intNum; check++) {
			if (ints[check] == countNum) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
