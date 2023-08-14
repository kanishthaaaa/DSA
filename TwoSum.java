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
        ans =nums;
        System.out.println(ans);
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
