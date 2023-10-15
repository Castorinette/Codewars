public class Solution{

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
      
        String[] select = new String[moves.length];
        int curr_row = position[0];
        int curr_col = position[1];

        for (int i = 0; i < moves.length; i++){
                if (moves[i].equals("up")|| moves[i].equals("down")){
                    curr_row = moves[i].equals("down") ? 1 : 0;
                }
                else if(moves[i].equals("right")){
                    if(curr_col == 5){ curr_col = 0;}
                    else{
                        curr_col++;
                    }
                }
                else if (moves[i].equals("left")){
                    if(curr_col == 0){ curr_col = 5;}
                    else{
                        curr_col--;
                    }
                }
            select[i] = fighters[curr_row][curr_col];
        }
        return select;
    }
}