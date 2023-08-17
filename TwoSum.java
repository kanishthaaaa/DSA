// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = new int[4];
        int[] ans = new int[4];
        int target =9;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        ans =twoSum(nums, target);
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i<nums.length ; i++){
            for(int j=i+1 ;j<nums.length ; j++ ){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
