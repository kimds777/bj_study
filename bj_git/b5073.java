package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class b5073 { // 수정해야함!h
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer st;
		List<Integer> triangle;

		StringBuilder sb = new StringBuilder();
		while (!((str = br.readLine()).equals("0 0 0"))) {
			st = new StringTokenizer(str, " ");
			triangle = new ArrayList<>();

			while (st.hasMoreTokens()) {
				triangle.add(Integer.parseInt(st.nextToken()));
			}

			Collections.sort(triangle);

			int sum = triangle.get(0) + triangle.get(1);
			if (sum >= triangle.get(2)) {
				if (triangle.get(0) == triangle.get(1) && triangle.get(0) == triangle.get(2)) {
					sb.append("Equilateral\n");
				} else if (triangle.get(0) == triangle.get(1) || triangle.get(1) == triangle.get(2)
						|| triangle.get(0) == triangle.get(2)) {
					sb.append("Isosceles\n");
				} else {
					sb.append("Scalene\n");
				}
			} else {
				sb.append("Invalid\n");
			}
		}
		br.close();
		System.out.println(sb);
	}
}
