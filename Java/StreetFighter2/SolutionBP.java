public class Solution{
  public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
    int rows = fighters.length;
    int cols = fighters[0].length;
    String[] result = new String[moves.length];
    for (int i = 0; i < moves.length; i++) {
      switch (moves[i]) {
      case "up":
        if (position[0] > 0) {
          position[0]--;
        }
        break;
      case "down":
        if (position[0] < rows-1) {
          position[0]++;
        }
        break;
      case "left":
        if (position[1] > 0) {
          position[1]--;
        } else {
          position[1] = cols-1;
        }
        break;
      case "right":
        if (position[1] < cols-1) {
          position[1]++;
        } else {
          position[1] = 0;
        }
        break;
      }
      result[i] = fighters[position[0]][position[1]];
    }
    return result;
  }
}