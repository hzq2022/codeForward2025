# Day1
## 每日任务 
掌握数组理论基础，704. 二分查找，27. 移除元素
详细布置

### 数组理论基础

文章链接：https://programmercarl.com/%E6%95%B0%E7%BB%84%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%80.html

题目建议： 了解一下数组基础，以及数组的内存空间地址，数组也没那么简单。

### 704. 二分查找

题目建议： 大家今天能把 704.二分查找 彻底掌握就可以，至于 35.搜索插入位置 和 34. 在排序数组中查找元素的第一个和最后一个位置 ，如果有时间就去看一下，没时间可以先不看，二刷的时候在看。

先把 704写熟练，要熟悉 根据 左闭右开，左闭右闭 两种区间规则 写出来的二分法。

题目链接：https://leetcode.cn/problems/binary-search/
文章讲解：https://programmercarl.com/0704.%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE.html
视频讲解：https://www.bilibili.com/video/BV1fA4y1o715


### 27. 移除元素

题目建议：  暴力的解法，可以锻炼一下我们的代码实现能力，建议先把暴力写法写一遍。 双指针法 是本题的精髓，今日需要掌握，至于拓展题目可以先不看。

题目链接：https://leetcode.cn/problems/remove-element/
文章讲解：https://programmercarl.com/0027.%E7%A7%BB%E9%99%A4%E5%85%83%E7%B4%A0.html
视频讲解：https://www.bilibili.com/video/BV12A4y1Z7LP

### 977.有序数组的平方

题目建议： 本题关键在于理解双指针思想

题目链接：https://leetcode.cn/problems/squares-of-a-sorted-array/
文章讲解：https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html
视频讲解： https://www.bilibili.com/video/BV1QB4y1D7ep 


# Day2
## 每日任务
详细布置：长度最小的子数组、螺旋矩阵II

### 209.长度最小的子数组

题目建议： 本题关键在于理解滑动窗口，这个滑动窗口看文字讲解 还挺难理解的，建议大家先看视频讲解。  拓展题目可以先不做。

题目链接：https://leetcode.cn/problems/minimum-size-subarray-sum/
文章讲解：https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html
视频讲解：https://www.bilibili.com/video/BV1tZ4y1q7XE


### 59.螺旋矩阵II

题目建议：  本题关键还是在转圈的逻辑，在二分搜索中提到的区间定义，在这里又用上了。

题目链接：https://leetcode.cn/problems/spiral-matrix-ii/
文章讲解：https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html
视频讲解：https://www.bilibili.com/video/BV1SL4y1N7mV/

## 数组总结
算法：二分法、双指针(相向双指针、滑动窗口、快慢指针)、数组模拟
1) 二分法与快慢双指针
快慢指针 [27. 移除元素](https://leetcode.cn/problems/remove-element/)
**熟记**
```
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
```
关于二分法和移除元素的共性思考
这两题之间有点类似的，他们都是在不断缩小 left 和 right 之间的距离，每次需要判断的都是 left 和 right 之间的数是否满足特定条件。对于「移除元素」这个写法本质上还可以理解为，我们拿 right 的元素也就是右边的元素，去填补 left 元素也就是左边的元素的坑，坑就是 left 从左到右遍历过程中遇到的需要删除的数，因为题目最后说超过数组长度的右边的数可以不用理，所以其实我们的视角是以 left 为主，这样想可能更直观一点。用填补的思想的话可能会修改元素相对位置，这个也是题目所允许的。

3) 双指针
相向双指针[977.有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/)
滑动窗口 [209.长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/)

相向双指针本质是遍历一次数组，对左闭右闭区间循环控制条件为left <= right，利用新的数组去按要求收集遍历到的结果，并根据遍历到的数值决定左右指针的移动；
滑动串窗口本质是遍历两次数组，右指针循环移动直到满足条件，此时收集结果并判断是否为最终结果，随后左指针移动打破已满足的条件，形成滑窗。

4) 数组模拟
