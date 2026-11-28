package com.blind75.easy.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)) return true;
            else map.put(i,i);
        }
        return false;

//        HashSet<Integer> set = new HashSet<>();
//        for(int i:nums){
//            if(set.contains(i)) return true;
//            else set.add(i);
//        }
//        return false;
    }

}
