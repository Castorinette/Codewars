public class Solution {
    static int stray(int[] numbers) {
        
        int i;
        int num = numbers[0];
        if (num != numbers[1]) {
            if (numbers[1] == numbers[2]) {
                return num;
            } else {
                return numbers[1];
            }
        }
        for (i = 2; i < numbers.length; i++) {
            if (numbers[i] != num) {
                break;
            }
        }
        return numbers[i];
    }
}