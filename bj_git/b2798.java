package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] cards = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();

		int maxSum = 0;
		for (int i = 0; i < NM[0] - 2; i++) {
			for (int j = i + 1; j < NM[0] - 1; j++) {
				for (int k = j + 1; k < NM[0]; k++) {
					int sum = cards[i] + cards[j] + cards[k];
					if (maxSum < sum && sum <= NM[1]) {
						maxSum = sum;
					}
				}
			}
		}
		
		System.out.println(maxSum);
	}
}
