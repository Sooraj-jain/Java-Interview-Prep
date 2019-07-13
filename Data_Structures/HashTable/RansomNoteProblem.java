package Data_Structures.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You kidnapped your neighbours Dog and want to send a Ransom note to your neighbour asking for money.
 * You can't write using hand as your neighbour knows your handwriting. So you want to cut words out of a magazine
 * and form a ransom note.
 * You have the words written in a paper, u select each word and cut that from magazine and keep it somewhere to
 * build Ransom note.
 * Write a program to check if you the magazine contains enough words with enough frequencies to build your Ransomnote
 * Program accepts 2 String arrays and returns a boolean.
 */
public class RansomNoteProblem {

    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String , Integer> getFrequency(String[] words) {

        HashMap<String, Integer> wordsFreq = new HashMap<>();

        for (String word: words) {
            if (!wordsFreq.containsKey(word)) {
                wordsFreq.put(word, 0);
            }
            wordsFreq.put(word, wordsFreq.get(word)+1);
        }

        return wordsFreq;
    }

    static private boolean canBuildRansomNote(HashMap<String, Integer> noteWords, HashMap<String, Integer> magazineWords) {

        for (Map.Entry<String, Integer> noteWord : noteWords.entrySet()) {
            final String word = noteWord.getKey();
            if (!magazineWords.containsKey(word) || magazineWords.get(word) < noteWord.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter note words separated by comma");
        String[] noteWords = scanner.nextLine().split(",");

        System.out.println("Enter Magazine words separated by comma");
        String[] magazineWords = scanner.nextLine().split(",");

        HashMap<String, Integer> noteFrequency = getFrequency(noteWords);
        HashMap<String, Integer> magazineFrequency = getFrequency(magazineWords);

        boolean canBuildRansomNote = canBuildRansomNote(noteFrequency, magazineFrequency);
        System.out.println("Can you build Ransom note? "+ canBuildRansomNote);
    }
}
