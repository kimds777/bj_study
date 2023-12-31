package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class b18870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int[] xi = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); //정렬전 배열	
		int[] xj = xi.clone(); // 정렬전 배열을 복사한다.
		Map<Integer,Integer> ranking = new HashMap<>();
		
		Arrays.sort(xj); //오름차순으로 정렬한다.
		
		int rank = 0; //정렬한 배열의 첫번째값 순위
		for(int j : xj) {
			if(!ranking.containsKey(j)) { // map에 key가 없는 경우
				ranking.put(j, rank); // key와 rank를 넣어준다
				rank++; // rank에 1을 더해준다.
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i : xi) {
			sb.append(ranking.get(i)+" "); //map에서 key값으로 rank값을 가져온다.
		}
		
		System.out.println(sb.toString());
	}
}
