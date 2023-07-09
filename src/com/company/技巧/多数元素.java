package com.company.技巧;

/**
 * @author xiu
 * @create 2023-07-09 10:23
 */
public class 多数元素 {
    public static void main(String[] args) {
        System.out.println(new 多数元素().majorityElement(new int[]{3, 2, 3}));
    }
//    投票法，要注意票的初始是1，不是0
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int count=1;
        for (int i = 1; i <nums.length ; i++) {
            if (res==nums[i]){
                count++;
            }else{
                count--;
            }
            if (count<=0){
                res=nums[i];
                count=1;
            }
        }
        return res;
    }
}
