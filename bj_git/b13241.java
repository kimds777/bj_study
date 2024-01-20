package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] AB = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long C = lcm(Math.max(AB[0], AB[1]), Math.min(AB[0], AB[1])); // if문 대신 Math를 활용!
		System.out.println(AB[0] * AB[1] / C);
	}

	private static long lcm(long a, long b) { // 재귀 호출 활용!
		if (b == 0) {
			return a;
		} else {
			return lcm(b, a % b);
		}
	}
}
