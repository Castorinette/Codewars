import java.lang.String;
public class Flames {
    public static String showRelationship(String male, String female) {

        int sumLen = male.length() + female.length();
        String sameL = "";
        for(int i = 0; i < male.length(); i++){
            char c = male.charAt(i);
            if(female.contains(String.valueOf(c)) && (!sameL.contains(String.valueOf(c)))){
                sumLen -=  (int) (male.chars().filter(ch -> ch == c).count() + female.chars().filter(ch -> ch == c ).count());
                sameL += c;
            }
        }
        String flames ="";
        switch (sumLen % 6){
            case 1:
                flames = "Friendship";
                break;
            case 2:
                flames = "Love";
                break;
            case 3:
                flames = "Affection";
                break;
            case 4:
                flames = "Marriage";
                break;
            case 5:
                flames = "Enemies";
                break;
            case 0:
                flames = "Siblings";
                break;
        }
        return flames;
    }
}