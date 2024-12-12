package chater1;

public class RemoveList {

    public int RemoveList(int target, int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++ ) {
            if (nums[fastIndex]!= target) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
