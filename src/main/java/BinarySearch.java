import java.util.Arrays;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;

// Time Complexity is O(log n)
class BinarySearch {
    // Returns either the index of the location in the array,
    // or -1 if the array did not contain the targetValue

    //iterative approach
    public static int doSearch(int[] array, int targetValue) {
        int min = 0;
        System.out.println(Arrays.toString(array));
        int max = array.length - 1;

        while(min<=max){
            int guess = (min + max) / 2;
            if(array[guess] == targetValue){
                System.out.println(guess);
                return guess;
            } else if(targetValue < array[guess]){
               max = guess - 1;
            } else {
                min = guess + 1;
            }
        }
        return -1;
    }

    //Recursive implementation

    public static int runBinarySearchRecursively(int[] sortedArray, int target, int left, int right){
        int guess = left + ((right - left) / 2);  //accounts for array overflow.. REMEMBER THIS

        //if the pointers cross, we know that our target is not in the given array
        if(left > right){
            //System.out.println(-1);
            return -1;
        }

        if(target == sortedArray[guess]){
            System.out.println(guess);
            return guess;
        } else if(target < sortedArray[guess]){
            return runBinarySearchRecursively(sortedArray, target, left,
                    guess - 1); // start the search from the left half
        } else {
            return  runBinarySearchRecursively(sortedArray, target, guess + 1, right); //start the search from right half
        }
    };

    public static int binarySearchMethod(int[] sortedArray, int target){
        int index = Arrays.binarySearch(sortedArray, target);
        System.out.println(index);
        return index;
    }

    public static int binarySearchMethodWithCollections(List<Integer> sortedList, Integer target){
        int index = Collections.binarySearch(sortedList,target);
        System.out.println(index);
        return index;

    }
    public static void main(String args[]){
        int numArray[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int numArray2[] = {-1,0,3,5,9,12};
        List<Integer> sortedList = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        doSearch(numArray2, 9);
       // runBinarySearchRecursively(numArray, 97, numArray[0], numArray.length - 1);
       // binarySearchMethod(numArray,83);
       // binarySearchMethodWithCollections(sortedList, 11);
    }
};
