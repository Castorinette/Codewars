import java.util.HashMap;
import java.util.Map;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        Map <Character, Integer> occ = new HashMap<>();
        for (int i = 0 ; i < str2.length() ; i++){
            char c = str2.charAt(i);
            if (!occ.containsKey(c)){
                occ.put(c,1);
            }
            else {
                occ.put(c, occ.get(c) +1);
            }
        }
        for(char letter : occ.keySet()){
            long occ_str1 = str1.codePoints().filter(ch -> ch == letter).count();
            System.out.println(occ_str1);
            if(occ_str1 < occ.get(letter)){return false;}
        }
        return true;
    }
}