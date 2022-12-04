package Lec_16_String_Doubt;

public class Subarray_sum_divisible_kk {
//	https://leetcode.com/problems/subarray-sums-divisible-by-k/
	public int subarraysDivByK(int[] nums, int k) {
        int ans =0;
        int[] rem = new int[k];
        int sum =0;
        for(int ali : nums){
            sum = sum+ali;
            
            int idx = sum%k;
            if(idx<0){
                idx = idx+k;
            }
            ans = ans + rem[idx];
            rem[idx] = rem[idx] +1;
            if(sum%k==0){
                ans ++;
            }
        }
        return ans;
        
    }
}
