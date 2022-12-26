public class ApplyOperations {


    public static int[] applyOperations(int[] nums) {
        //i want my switcher to be wherever 0 is, which will be i+1

        //iterate through the loop, if nums[i] != nums[i+1], do nothing
        //if they are equal, multiply nums[i] by 2 and make nums[i + 1] 0, bring switcher to zero and then switch
        int switcher = 0;
        for(int i = 0; i < nums.length; i++){
            //thing i wanna do if condition is met
            if(nums[i] == nums.length){
                return nums;
            }
            System.out.println(nums[i]);
            if(nums[i] == nums[i+1] ){
                nums[i] = nums[i * 2];
                nums[i + 1] = 0;
            }
            //thing i wanna do otherwise
            switcher++;
        }

        return nums;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,1,1,0};
        System.out.println(applyOperations(arr));
    }
}
