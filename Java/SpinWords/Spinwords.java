import java.lang.StringBuffer;
public class SpinWords {

    public static String spinWords(String sentence) {
        StringBuffer word;
        String spin = "";
        String[] sentCopy = sentence.split(" ");
        for(int i = 0; i < sentCopy.length; i++){
            if (sentCopy[i].length() >= 5 && sentCopy[i].matches("[a-zA-Z]+")){
                word = new StringBuffer(sentCopy[i]);
                spin += word.reverse();
            }
            else {
                spin += sentCopy[i];
            }
            if (i < sentCopy.length -1){
                spin += " ";
            }
        }
        return spin;
    }
}