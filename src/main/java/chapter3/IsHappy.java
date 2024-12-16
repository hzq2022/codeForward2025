package chapter3;

import java.util.HashSet;

public class IsHappy {
    //leetcode submit region begin(Prohibit modification and deletion)
    public boolean isHappy(int n) {
        HashSet<Object> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNextNumber(n);
        }
        return n == 1;
    }
    private int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n%10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }
}
