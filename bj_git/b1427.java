package bj_git;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class b1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long N = Long.parseLong(br.readLine());
		br.close();

		List<Integer> descSort = new ArrayList<>();

		while (N != 0) {
			int temp = (int) (N % 10);
			descSort.add(temp);
			N /= 10;
		}

		Collections.sort(descSort, Comparator.reverseOrder());

		for (int d : descSort) {
			bw.write(String.valueOf(d));
		}

		bw.flush();
		bw.close();
	}
}
