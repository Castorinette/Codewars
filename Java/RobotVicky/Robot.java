import java.util.regex.*;
public class Robot {
    private String vocabulary = " THANK YOU FOR TEACHING ME I ALREADY KNOW THE WORD DO NOT UNDERSTAND THE INPUT ";
    public String learnWord (String word){

        if(!word.matches("^[a-zA-Z]*$") || word.isEmpty()){
            return "I do not understand the input";
        }
        if (vocabulary.contains(" "+ word.toUpperCase()+ " ")){
            return "I already know the word " + word;
        }
        vocabulary+= word.toUpperCase() + " ";
        return "Thank you for teaching me "+ word;
    }
}