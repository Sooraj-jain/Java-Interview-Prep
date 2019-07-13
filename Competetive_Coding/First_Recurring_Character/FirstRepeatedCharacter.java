package Competetive_Coding.First_Recurring_Character;

import java.util.HashSet;
import java.util.Set;

/**
 * First repeated char . Complexity O(n)
 * can be made O(n^2) using 2 loops to compare each char with every other char
 */
public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        Character[] charSeries = new Character[4];
        charSeries[0] = 'A';
        charSeries[1] = 'B';
        charSeries[2] = 'B';
        charSeries[3] = 'A';
        Set<Character> unique = new HashSet<>();

        for(Character c: charSeries) {
                if (unique.contains(c)) {
                    System.out.println("yes its repeated " + c);
                    break;
                }
            System.out.println("Adding new char "+c);
            unique.add(c);
        }
    }
}
