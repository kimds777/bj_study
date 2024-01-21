package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class b2485 { // 수정해야함!
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		List<Integer> trees = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			trees.add(Integer.parseInt(br.readLine()));
		}

		int gcd = trees.get(N - 1);
		List<Integer> distance = getDistance(trees, trees.size());
		for (int d = 0; d < distance.size() - 1; d++) {
			int tempGcd = getGcd(Math.max(distance.get(d), distance.get(d + 1)),
					Math.min(distance.get(d), distance.get(d + 1)));

			if (tempGcd < gcd) {
				gcd = tempGcd;
			}
		}

		int cnt = 0;
		for (int d : distance) {
			if (d != gcd) {
				cnt += d / gcd - 1;
			}
		}
		
		System.out.println(cnt);

	}

	private static List<Integer> getDistance(List<Integer> trees, int N) {
		List<Integer> list = new ArrayList<>();

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N - 1; i++) {
			int tree1 = trees.get(i);
			int tree2 = trees.get(i + 1);

			int minus = Math.abs(tree1 - tree2);
			list.add(minus);
		}

		return list;
	}

	private static int getGcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGcd(b, a % b);
		}
	}
}
