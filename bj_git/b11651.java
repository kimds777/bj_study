package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class b11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 평면의 점의 갯수 N
		int[][] xy = new int[N][2];

		for (int i = 0; i < N; i++) { // N의 x,y 좌표를 받는다.
			xy[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			//Stream을 이용해 String을 int[]로 변환.
		}

		Arrays.sort(xy, new Comparator<int[]>() { // Arrays.sort는 2차원 배열을 정렬할 수 없기때문에 Comparator을 사용하여 정렬한다.

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) { // 두개의 배열의 1번째 index값을 동일한 경우
					return o1[0] - o2[0]; // 두개의 배열의 0번째 index값을 비교한다.
				} else { // 두개의 배열의 1번째 index값을 다른 경우
					return o1[1] - o2[1]; // 두개의 배열의 1번째 index값을 비교한다.
				}
			}

		});

		StringBuilder sb = new StringBuilder();
		for (int[] x : xy) {
			sb.append(x[0]+" "+x[1]+"\n");
		}
		
		System.out.println(sb.toString());
	}
}
