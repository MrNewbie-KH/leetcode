package ps.neetcoderoadmap.blind75.arraysandhashes.twosum;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
//Solution 1 using hash map
        public int[] twoSum(int[] nums, int target) {
            int [] ans = new int [2];
            Map<Integer,Integer> map = new HashMap<>();
            // check exsitance first
            for(int i=0;i<nums.length;i++)
            {
                if(map.containsKey(target-nums[i])){
                    ans[0]=map.get(target-nums[i]);
                    ans[1]=i;
                    break;
                }
                map.put(nums[i],i);
            }
            return ans;
        }
    }

