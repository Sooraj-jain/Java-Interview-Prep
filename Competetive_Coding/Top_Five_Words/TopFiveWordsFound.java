package Competetive_Coding.Top_Five_Words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * To find top 5 most frequent words
 */
public class TopFiveWordsFound {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/sj042124/Documents/RefRecord_Repo/Practice_V2/src/words.txt"));


        String[] words = new String[] {""} ;
        ArrayList<String> lines = new ArrayList<>();

        String line= reader.readLine();
        while(line!=null) {

            words = line.split(" ");
            for(String a: words) {
                lines.add(a);
            }

            line = reader.readLine();
        }

        Set<String> uniqueWords = new HashSet<String>();


        for(String a: lines) {
            uniqueWords.add(a);
        }

        Map<String , Integer> workCountMap = new HashMap<>();
        for (String a: lines) {
            if(uniqueWords.contains(a)) {
                if(workCountMap.containsKey(a)) {
                    workCountMap.put(a,workCountMap.get(a)+1);
                }
                else {
                    workCountMap.put(a,1);
                }
            }
        }

        System.out.println("size: "+lines.size());
        System.out.println(workCountMap);
    }
}