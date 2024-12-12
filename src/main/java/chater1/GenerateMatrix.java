package chater1;

public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0, startY = 0;  // 每一圈的起始点
        int offset = 1;
        int count = 1;  // 矩阵中需要填写的数字
        int loop = 1; // 记录当前的圈数
        int i, j; // j 代表列, i 代表行;
        while (loop <= n/2) {
            // 顶部
            // 左闭右开，所以判断循环结束时， j 不能等于 n - offset
            for (j = startY; j < n-offset; j++) {
                nums[startX][j] = count++;
            }
            // 右列
            // 左闭右开，所以判断循环结束时， i 不能等于 n - offset
            for (i = startX; i < n-offset; i++) {
                nums[i][j] = count++;
            }
            for (;  j > startY; j--) {
                nums[i][j] = count++;
            }

            for (;  i > startX; i--) {
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if (n%2==1) {
            nums[startX][startY] = count;
        }
        return nums;
    }
}
