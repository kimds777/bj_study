package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b24313 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] fn = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // f(n)
		int c = Integer.parseInt(br.readLine()); // c
		int n = Integer.parseInt(br.readLine()); // n0
		br.close();

		int ans = 0;
		if (c > fn[0]) {
			if ((c - fn[0]) * n >= fn[1]) {
				ans = 1;
			}
		} else if (c == fn[0]) {
			if (fn[1] <= 0) {
				ans = 1;
			}
		}

		System.out.println(ans);

	}
}
