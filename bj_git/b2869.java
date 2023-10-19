package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] snail = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();

		int dayCnt = (snail[2] - snail[1]) / (snail[0] - snail[1]);
		if ((snail[2] - snail[1]) % (snail[0] - snail[1]) != 0) {
			dayCnt++;
		}

		System.out.println(dayCnt);
	}
}
