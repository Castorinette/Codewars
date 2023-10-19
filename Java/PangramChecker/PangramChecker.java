import java.util.Arrays;

public class PangramChecker {

    public static boolean contains(int[] l, int el){
        for(int i: l){
            if (i == el){
                return true;
            }
        }
        return false;
    }
    public static boolean check (String sentence){
        char ascii;
        char[] letters = new char[26];
        int compt = 0;
        for(int i = 0; i < sentence.length(); i++){
            ascii = Character.toUpperCase(sentence.charAt(i));
            if (!(contains(letters,ascii)) && ascii >= 'A' && ascii <= 'Z'){
                letters[compt] = ascii;
                compt++;
                if (compt == letters.length){break;}
            }
        }
        return letters[letters.length-1] != 0;
    }