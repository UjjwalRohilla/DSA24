package Questions.Strings;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
    }
    public static void printDuplicates(String str){
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        char[] toChar = new char[chars.size()];
        int index = 0;
        for(Character character : chars) {
            toChar[0] = character;
            index++;
        }
        for (int i = 0; i < toChar.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                System.out.print(toChar[i]+"->");
                if(str.charAt(j)==toChar[i]){

                }
            }
        }
    }
}
