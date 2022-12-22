import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return false;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        };

        int count;

        for(int i : nums){
            count = map.getOrDefault(i, 0);
            if(count > 1)
                return true;
//            } else {
//                map.put(i, count - 1);
//            }
        }


        return false;

    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4};
        boolean test = containsDuplicate(nums);
        System.out.println(test);
    }
}
