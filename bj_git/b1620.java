package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class b1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] NM = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		List<String> poketmonName = new ArrayList<>();
		Map<String, Integer> poketmonIndex = new HashMap<>();
		for (int i = 0; i < NM[0]; i++) {
			String name = br.readLine();
			poketmonName.add(name);
			poketmonIndex.put(name, i + 1);
		}

		StringBuilder sb = new StringBuilder();
		while (NM[1]-- > 0) {
			String poketmon = br.readLine();
			if (poketmonIndex.containsKey(poketmon)) {
				sb.append(poketmonIndex.get(poketmon) + "\n");
			} else {
				sb.append(poketmonName.get(Integer.parseInt(poketmon) - 1)+"\n");
			}
		}
		
		System.out.println(sb);
	}
}
