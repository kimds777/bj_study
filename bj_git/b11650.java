package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class b11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 평면의 점의 갯수 N

		int[][] xy = new int[N][2];
		for (int i = 0; i < N; i++) { // N의 x,y 좌표를 받는다.
			xy[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			//Stream을 이용해 String을 int[]로 변환.
		}
		
		//br.close(); -> close를 했더니 시간과 메모리가 더 늘어난다..
		
		/* 궁금해서 찾아보니 close를 하지말고 JVM에서 관리하도록 냅둬야한단다.
		 --------------------------------------------------------
		 System.in 개체는 JVM에 의해 열리기 때문에 닫으려면 JVM에 맡겨야 합니다. 
		 닫은 후 나중에 다른 이유로 System.in을 사용하려고 하면 더 이상 사용할 수 없다는 사실에 놀랄 것입니다. 
		 따라서 System.in에 연결된 스캐너를 닫을 때는 닫지 마십시오. System.in의 종료를 JVM에 맡깁니다.
		 
		 + Java에서 BufferedReader는 사용하지 않으면 GC의 대상이 되기 때문에 개발자가 직접 close() 해주지 않아도 된다고한다..!
		 
		+ BufferedWriter의 경우 writing을 끝낸 후 적절하게 close()를 해주지 않는다면 정상적으로 writing이 되지 않는 경우가 많다고 한다.
		 
		 */
		
		Arrays.sort(xy, new Comparator<int[]>() { // Arrays.sort는 2차원 배열을 정렬할 수 없기때문에 Comparator을 사용하여 정렬한다.

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) { // 두개의 배열의 0번째 index값을 동일한 경우
					return o1[1] - o2[1]; // 두개의 배열의 1번째 index값을 비교한다.
				} else { // 두개의 배열의 0번째 index값을 다른 경우
					return o1[0] - o2[0]; // 두개의 배열의 0번째 index값을 비교한다.
				}
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int[] x : xy) {
			sb.append(x[0] + " " + x[1] + "\n");
		}

		System.out.println(sb.toString());
	}
}
