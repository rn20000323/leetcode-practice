package com.blind75.medium.array;

/*Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ArrayProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int i=0,j= nums.length-1;
        int[] res = new int[nums.length];
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int prefix = 1, suffix=1;
        while(i<nums.length){
            prefixProduct[i]=prefix*=nums[i++];
            suffixProduct[j] = suffix*=nums[j--];
        }
        for(int k=0; k< nums.length; k++){
            if(k==0) res[k] = suffixProduct[k+1];
            else if (k==nums.length-1) res[k] = prefixProduct[k-1];
            else res[k] = prefixProduct[k-1]*suffixProduct[k+1];
        }
        return res;

//        Use answer array for prefixProduct
//        int n = nums.length;
//        int[] answer = new int[n];
//
//        // First pass: store left products in answer array
//        answer[0] = 1;
//        for (int i = 1; i < n; i++) {
//            answer[i] = answer[i-1] * nums[i-1];
//        }
//
//        // Second pass: use variable to track right products
//        int rightProduct = 1;
//        for (int i = n-1; i >= 0; i--) {
//            answer[i] = answer[i] * rightProduct;
//            rightProduct *= nums[i];
//        }
//
//        return answer;
    }

    static void main(String[] args) {

    }

}
