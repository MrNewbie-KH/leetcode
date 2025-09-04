package ps.neetcoderoadmap.blind75.arraysandhashes;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }
            else
                return true;
        }
        return false;
    }
}
