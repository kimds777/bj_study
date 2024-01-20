package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class b1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int[] irreducibleFraction = { (A[0] * B[1]) + (B[0] * A[1]), A[1] * B[1] };
		int C = lcm(irreducibleFraction[1], irreducibleFraction[0]);

		System.out.println(irreducibleFraction[0] / C + " " + irreducibleFraction[1] / C);
	}

	private static int lcm(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return lcm(b, a % b);
		}
	}

}
