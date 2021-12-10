package academy.learnprogramming.arrays;
/**
 * 
 * Bubble Sort
 * lastUnsortedIndex -- always the last element
 * array partiotoned into two, sorted and unsorted, compare two elements and swap if they left is less than right, else move to next untill lastUnsortedIndex
 *  decreent lastUnsortedIndex for next iteration
 * 
 * inplace algorithm - memory size doesn't increase with input array size, few additional variables can be used
 * quadratic - O(n^2)
 * stabe sort -- relative order is preserved (< instead of <=)
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {

                    //swap method, references are passed or values??
                    swap(intArray, i, i + 1);
                }
            }
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
