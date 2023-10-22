import java.lang.String;
public class Flames {
    public static String showRelationship(String male, String female) {

        choice = (int) (Math.random(1000)+1) % 2 ? "KIFF" : "PAS KIFF"
        return choice;

    }
        public static void main(String [] args){
            System.out.println(Flames.showRelationship("Elisa", "Tifenn"));
            String[] names = {"Nadir", "Anishka", "Emilie", "Wilhem", "Beeverly"};

            for (String nom: names){
                for(String nom2:names){
                    if (nom != nom2){
                        System.out.println(nom + "+" + nom2 + " = " +Flames.showRelationship(nom,nom2));
                    }
                }
                System.out.println();
            }
        }
}