import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMaximum {
    //in a given array or list, return a list of  the maximum value in a subarray of size w

    public static ArrayDeque<Integer> slidingWindowMaximum(List<Integer> nums, int windowSize){
        ArrayDeque<Integer> result = new ArrayDeque<>();

        //initialze another deque to act as the window container
        ArrayDeque<Integer> window = new ArrayDeque<>();

        //If nums is empty, return an empty deque
        if(nums.size() == 0) return result;

        //if the window size is greater than the array size, set the array size to the window size
        if(windowSize > nums.size()) windowSize = nums.size();

        //Not sure what this is for
        boolean check = false;
        //iterate through the window and not the array, this contains our window
        for(int i = 0; i < windowSize; i++){
            //while there are items in the deque
            //checks if the current index in the nums array is greater than or equal to the last item in the window
             while((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
                 check = true;
                 window.removeLast();
             }
             check = false;
             //add current element to the deque, this would be the first element added to the deque, when starting the iteration
            //if the current is larger than the last, it'll be added to the window, in the first iteration this will always be true
            //this will guarantee that there will always be something to return as long as the array isn't empty
             window.addLast(i);
        }
        //once the window is traversed and values are compared..we should end up with 1 value.. add it to the result array
        result.add(nums.get(window.peek()));


     //iterate through the array, starting from the window since we already dealt with the intiial window
        for(int i = windowSize; i < nums.size(); i++){

            while((!window.isEmpty()) && nums.get(i) >= window.peekLast()){
                window.removeLast();
            }

            if((!window.isEmpty()) && window.peek() <= (i - windowSize)){
                window.removeFirst();
            }
            window.addLast(i);
            result.add(nums.get(window.peek()));
        }
        System.out.println(result);
        return result;
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        //create a new array to store the result in, the size will be the 2 arrays combined
        //i could probably iterate through one array and keep a pointer at the other
        //at the iterations, compare the current indexes and add the one thats smaller, then the other
        //then increment pointer 1

        int[] result = new int[arr1.length + arr2.length];
        int result_index = 0;
        int first = 0;


        for (int second = 0; second < arr2.length; second++) {
            if (arr1[first] < arr2[second]) {
                result[result_index] = arr1[first];
                result_index++;
                result[result_index] = arr2[second];
                first++;
            } else if (arr1[first] > arr2[second]) {
                result[result_index] = arr2[second];
                result_index++;
                result[result_index] = arr1[first];
                first++;
            }
        }
    }
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(-4,2,-5,1,-1,6);
        int[] arr = {1,3,4,5};
        int[] arr2 = {2,6,7,8};
       Arrays.asList(arr);
        slidingWindowMaximum(nums, 3);

    }
}
