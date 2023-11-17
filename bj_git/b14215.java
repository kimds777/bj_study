package bj_git;

import java.io.*;
import java.util.*;

public class b14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		List<Integer> triangle = new ArrayList<>();

		while (st.hasMoreTokens()) {
			triangle.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(triangle);

		while (triangle.get(2) >= triangle.get(0) + triangle.get(1)) {
			triangle.set(2, triangle.get(0) + triangle.get(1) - 1);
			Collections.sort(triangle);
		}

		int ans = 0;
		for (int t : triangle) {
			ans += t;
		}

		System.out.println(ans);

	}
}
