public class SelectionSort {
    //SelectionSort: sorts arrays in ascending or descending order

    //The solution below is O(n^2) which is really really bad for large data
    //sets, lets try and find a better solution after learning this one

    public static void selectionSort(int[] array){

        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }

    static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        return;
    }

    static int indexOfMinimum(int[] array, int startIndex) {
        int minValue = array[startIndex];
        int minIndex = startIndex;

        for(int i = minIndex + 1; i < array.length; i++) {
            if(array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }
        return minIndex;
    };

    public static void selectionSort2(int[] array) {
        // Write this method
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = indexOfMinimum(array, i);
            swap(array, minIndex, i);
        }
        return;
    }
    public static void main(String[] args){
        int array[] = {4,6,2,5,1,9,8};
        selectionSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

}
