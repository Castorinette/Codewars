import java.util.*;
public class Game {
    public String winner(String[] deckSteve, String[] deckJosh) {
        List<String> deck = Arrays.asList("2","3","4","5","6","7","8","9","T","J","Q","K","A");
        int joshScore = 0;
        int steveScore = 0;


        for (int i = 0; i < deckSteve.length; i++){
            if(deck.indexOf(deckSteve[i])> deck.indexOf(deckJosh[i])){
                steveScore++;
            }
            else if ((deck.indexOf(deckSteve[i]) < deck.indexOf(deckJosh[i]))){
                joshScore++;
            }
        }

        if(joshScore>steveScore){
            return "Josh wins " + joshScore + " to " + steveScore;
        } else if(steveScore > joshScore) {
            return "Steve wins " + steveScore + " to " + joshScore;
        }
        return "Tie";
    }
}