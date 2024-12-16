package chapter3;

import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class InterSection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    res.add(nums1[i]);
                }
            }
        }
        int index = 0;
        int[] result = new int[res.size()];
        for (int k : res) {
            result[index] = k;
            index++;
        }
        return result;
    }
}