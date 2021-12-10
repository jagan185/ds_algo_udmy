package academy.learnprogramming.arrays;

/**
 * Selection Sort -- divides array into sorted and unsorted arrays like bubble sort
 *                -- find the largest element in the unsorted partition and swap it with the last element in unsorted partition
 * 
 * lastUnsortedIndex -- initially, the last element -> array length
 * largest           -- initially, the first element, index 0
 * 
 * inplace, quadratic, not-stable
 */
public class SelectionSort {

    public static void main(String[] args) {


        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //sorted partition is increasing 
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {

            int largest = 0;
            //find the largest element in unsorted partition
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            
            swap(intArray, largest, lastUnsortedIndex);

        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
