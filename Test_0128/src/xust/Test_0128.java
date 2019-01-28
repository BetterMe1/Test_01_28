package xust;

import java.util.Arrays;

/*
1. ȱʧ����
����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����

ʾ�� 1:
����: [3,0,1]
���: 2

ʾ�� 2:
����: [9,6,4,2,3,5,7,0,1]
���: 8
˵��:
����㷨Ӧ��������ʱ�临�Ӷȡ����ܷ��ʹ�ö��ⳣ���ռ���ʵ��?
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
//	 * �㷨˼�룺�������򣬱Ƚ������������Ƿ���ȣ������˵����������֣�ѭ����û���ҵ���˵��ȱ�ٵ������һ�����֣���nums.length
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
//     * �㷨˼�룺��0��nums.length֮������ֽ�����ͣ���͹�ʽn*(n-1)/2,��ȥ������������֮�ͣ������ٵ��Ǹ�����
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
2. �ƶ���
����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��

ʾ��:
����: [0,1,0,3,12]
���: [1,3,12,0,0]
˵��:
������ԭ�����ϲ��������ܿ�����������顣
�������ٲ�������
 */
//public class Test_0128 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {0,0,1};
//		So.moveZeroes(nums);
//		//��ӡ����
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
3.  Nim��Ϸ
���������ѣ�������һ���� Nim��Ϸ����������һ��ʯͷ��ÿ�����������õ� 1 - 3 ��ʯͷ�� �õ����һ��ʯͷ���˾��ǻ�ʤ�ߡ�����Ϊ���֡�
�����Ǵ����ˣ�ÿһ���������Ž⡣ ��дһ�����������ж����Ƿ�����ڸ���ʯͷ�����������Ӯ����Ϸ��

ʾ��:
����: 4
���: false 
����: ��������� 4 ��ʯͷ����ô����Զ����Ӯ�ñ�����
     ��Ϊ���������� 1 �顢2 �� ���� 3 ��ʯͷ�����һ��ʯͷ���ǻᱻ����������ߡ�
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
4. 3����
����һ��������дһ���������ж����Ƿ��� 3 ���ݴη���

ʾ�� 1:
����: 27
���: true

ʾ�� 2:
����: 0
���: false

ʾ�� 3:
����: 9
���: true

ʾ�� 4:
����: 45
���: false
���ף�
���ܲ�ʹ��ѭ�����ߵݹ�����ɱ�����
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
