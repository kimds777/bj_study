package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] testCase = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int c = 0;
			for (int j = 1; j <= testCase[i]; j++) {
				if (testCase[i] % j == 0) {
					c++;
				}
			}
			if(c == 2) {
				cnt++;				
			}
		}
		
		System.out.println(cnt);
	}
}
