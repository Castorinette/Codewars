public class FindOutlier {
    static int find(int[] nums) {
        if (Math.floorMod(nums[0], 2) != Math.floorMod(nums[1], 2) && Math.floorMod(nums[0], 2) != Math.floorMod(nums[2], 2)){
            return nums[0];
        }
        int oddEven = Math.floorMod(nums[0], 2);
        for(int i : nums){
            if (Math.floorMod(i, 2)!= oddEven){
                return i;
            }
        }
        return 0;
    }
}