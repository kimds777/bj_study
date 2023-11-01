package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class b1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] rec = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		
		List<Integer> length = Arrays.asList(rec[0],rec[1],rec[2]-rec[0],rec[3]-rec[1]);
		Collections.sort(length);
		
		System.out.println(length.get(0));		
	}
}
