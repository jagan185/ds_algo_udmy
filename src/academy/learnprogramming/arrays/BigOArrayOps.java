package academy.learnprogramming.arrays;

/**
 * Time complexity for Array Operations
 * Retrieve with index (known index) -- O(1) 
 * Retrieve without index -- O(n)
 * Adding an element to a full array -- O(n)
 *	(since array size is static, create a brand new and copy all elements) 
 * Adding an element at the end to an array with space left -- O(1)
 * Insert or Update an element at an index -- O(1)
 * Delete an element by setting it to null -- O(1)
 * Delete an element by shifting elements -- O(n)
 */
public class BigOArrayOps {

    public static void main(String[] args) {
	    int[] intArray = new int[7];

	    intArray[0] = 20;
	    intArray[1] = 35;
	    intArray[2] = -15;
	    intArray[3] = 7;
	    intArray[4] =55;
	    intArray[5] = 1;
	    intArray[6] = -22;

	    int index = -1;
	    for (int i = 0; i < intArray.length; i++) {
	        if (intArray[i] == 7) {
	            index = i;
	            break;
            }
        }

        System.out.println("index = " + index);


    }
}
