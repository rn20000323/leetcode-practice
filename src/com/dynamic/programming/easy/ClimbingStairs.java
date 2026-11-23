package com.dynamic.programming.easy;

/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int climbStairs(int n) {
        return climbStairs(0, n, new HashMap<>());
    }

    private int climbStairs(int start, int n, Map<Integer, Integer> memo){
        if(memo.containsKey(start)) return memo.get(start);
        if (start == n) return 1;
        if (start > n) return 0;
        memo.put(start, climbStairs(start+1, n, memo)+climbStairs(start+2, n, memo));
        return memo.get(start);
    }
}

public class ClimbingStairs {

    //Node
    public static void main(String[] args) {
        Solution par = new Solution();
        int n=45;
        System.out.println(par.climbStairs(n));
    }

}