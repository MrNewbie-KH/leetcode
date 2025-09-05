package ps.neetcoderoadmap.blind75.arraysandhashes.validanagram;

import java.util.HashMap;
import java.util.Map;

class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length())
                return false;
            int ctr1 =0;
            int ctr2 =0;
            Map<Character,Integer> m1 = new HashMap();
            Map<Character,Integer>m2 = new HashMap();
            for(int i=0;i<s.length();i++){
                ctr1 = m1.getOrDefault(s.charAt(i),0);
                m1.put(s.charAt(i),ctr1+1);
                ctr2 = m2.getOrDefault(t.charAt(i),0);
                m2.put(t.charAt(i),ctr2+1);
            }

            return m1.equals(m2);

        }
    }

