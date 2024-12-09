package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> nickNameSet = new HashSet();

        int ans = 0;
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String text = br.readLine();
            if(text.equals("ENTER")){
                nickNameSet.clear();
            }else if(nickNameSet.add(text)){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
