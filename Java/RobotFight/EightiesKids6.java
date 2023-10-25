import java.util.Map;

public class EightiesKids6 {

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {

        Robot fast = robot1.getSpeed() >= robot2.getSpeed() ? robot1  : robot2;
        Robot slow = fast == robot1 ? robot2 : robot1;

        String[] fastTactics = fast.getTactics();
        String[] slowTactics = slow.getTactics();

        int fastHealth = fast.getHealth();
        int slowHealth = slow.getHealth();

        int i = 0;
        while (i < fastTactics.length  || i < slowTactics.length) {

            if (i < fastTactics.length) {
                slowHealth -= tactics.get(fastTactics[i]);
                if (slowHealth <= 0) {
                    return fast.getName() + " has won the fight.";
                }
            }
            if (i < slowTactics.length ) {
                fastHealth -= tactics.get(slowTactics[i]);
                if (fastHealth <= 0) {
                    return slow.getName() + " has won the fight.";
                    }
            }
            i++;    
        }

        if (fastHealth == slowHealth){
            return "The fight was a draw.";
        }
        String winner = fastHealth > slowHealth? fast.getName() : slow.getName();
        return  winner +  " has won the fight.";
    }
}