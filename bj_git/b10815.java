package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class b10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] nCards = br.readLine().split(" "); // 상근이 카드 배열

		int mCardsSize = Integer.parseInt(br.readLine());// M 카드 갯수
		String[] mCards = new String[mCardsSize]; // M카드 배열
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // M카드를 문자열로 받아 " "로 분리한다

		Map<String, Integer> checkM = new HashMap<>();
		for (int i = 0; i < mCardsSize; i++) {
			String key = st.nextToken(); // 분리된 M카드를
			checkM.put(key, 0); // map과
			mCards[i] = key; // M카드 배열에 넣는다.
		}

		for (String n : nCards) {
			if (checkM.containsKey(n)) { // checkM에 상근이 카드가 존재하는 경우
				checkM.replace(n, 1); // checkM의 값을 변경해준다.
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String key : mCards) { // M카드 배열 순서대로 카드 존재 여부를
			sb.append(checkM.get(key) + " "); // StringBuilder에 넣는다.
		}

		System.out.println(sb.toString());
	}
}
