package xust;

import java.util.Arrays;

/*
1. 缺失数字
给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。

示例 1:
输入: [3,0,1]
输出: 2

示例 2:
输入: [9,6,4,2,3,5,7,0,1]
输出: 8
说明:
你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 */
//public class Test_0128 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {2,3,1};
//		System.out.println(So.missingNumber2(nums));
//	}
//}
//class Solution {
//	/*
//	 * 算法思想：数组排序，比较序列与索引是否相等，不相等说明少这个数字，循环完没有找到，说明缺少的是最后一个数字，即nums.length
//	 */
//    public int missingNumber1(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0; i<nums.length; i++){
//        	if(nums[i] != i){
//        		return i;
//        	}
//        }
//        return nums.length;
//    }
//    /*
//     * 算法思想：对0到nums.length之间的数字进行求和，求和公式n*(n-1)/2,减去序列所有数字之和，就是少的那个数字
//     */
//	public int missingNumber2(int[] nums) {
//		int sum = 0;
//		int len = nums.length;
//		for(int i=0; i<len; i++){
//			sum += nums[i];
//		}
//		return len*(len+1)/2-sum;
//	}
//}

/*
2. 移动零
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:
必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数
 */
//public class Test_0128 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {0,0,1};
//		So.moveZeroes(nums);
//		//打印数组
//		for(int i=0; i<nums.length; i++){
//			System.out.print(nums[i]+" ");
//		}
//	}
//}
//class Solution {
//    public void moveZeroes(int[] nums) {
//    	int j = 0;
//        for(int i=0; i<nums.length; i++){
//        	if(nums[i] != 0){
//        		nums[j] =nums[i];
//        		j++;
//        	}
//        }
//        while(j<nums.length){
//        	nums[j] =0;
//        	j++;
//        }
//    }
//}
/*
3.  Nim游戏
你和你的朋友，两个人一起玩 Nim游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。

示例:
输入: 4
输出: false 
解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
     因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
 */
//public class Test_0128 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.canWinNim(4));
//	}
//}
//class Solution {
//    public boolean canWinNim(int n) {
//        return n%4!=0;
//    }
//}
/*
4. 3的幂
给定一个整数，写一个函数来判断它是否是 3 的幂次方。

示例 1:
输入: 27
输出: true

示例 2:
输入: 0
输出: false

示例 3:
输入: 9
输出: true

示例 4:
输入: 45
输出: false
进阶：
你能不使用循环或者递归来完成本题吗？
 */
//public class Test_0128 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		System.out.println(So.isPowerOfThree(3));
//	}
//}
//class Solution {
//    public boolean isPowerOfThree(int n) {
//    	return n > 0 && (1162261467 % n==0);
//    }
//}
