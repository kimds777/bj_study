package bj_git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class b26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Set<String> peopleSet = new HashSet();
        peopleSet.add("ChongChong");

        while (N-- > 0) {
            String[] name = br.readLine().split(" ");

            if(peopleSet.contains(name[0]) || peopleSet.contains(name[1])){
                peopleSet.add(name[1]);
                peopleSet.add(name[0]);
            }
        }

        System.out.println(peopleSet.size());
    }
}
