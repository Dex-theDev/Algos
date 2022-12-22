import java.util.Random;

public class InsertionSort {
    //Insertion Sort sorts arrays by inserting an item where it belongs
    //This is also O(n^2)... so still not good

    public static void insertionSort(int[] inputArray){
        //we start at 1 because 0 is always sorted with itself
        for(int i = 1; i < inputArray.length; i++){
            int currentValue = inputArray[i];

            //we wanna look at the previous element in the array from the one we're looking at
            int j = i - 1;
            while(j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
    private static void printArray(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Random random  = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        System.out.print("Before:");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After");
        printArray(numbers);

    }



}
