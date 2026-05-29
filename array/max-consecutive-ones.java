import java.util.List;
import java.util.ArrayList;import java.util.Collections;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList<>();
    int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                {
                    ++count;
                }
                else
                {
                list.add(count);
                count=0;
                }
    
        }
        list.add(count);
        int max=Collections.max(list);
        return max;
    }
    }
