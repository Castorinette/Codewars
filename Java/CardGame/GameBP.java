public class Game {

  public String winner(String[] deckSteve, String[] deckJosh) {
    String cards = "23456789TJQKA";
    int sSteve = 0;
    int sJosh = 0;
    for (int i = 0; i < deckSteve.length; i++) {
      int winner = cards.indexOf(deckSteve[i]) - cards.indexOf(deckJosh[i]);
      sSteve += winner > 0 ? 1 : 0;
      sJosh += winner < 0 ? 1 : 0;
    }    
    
    return (sSteve > sJosh) ? "Steve wins " + sSteve + " to " + sJosh :
           (sJosh > sSteve) ? "Josh wins " + sJosh + " to " + sSteve :
           "Tie";
  }
}