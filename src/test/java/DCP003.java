import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This problem was asked by Stripe.
 *
 * Given an array of integers, find the first missing positive integer in linear time and constant space.
 * In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 */
public class DCP003 {

    @Test
    public void testFindLowestMissingPositiveInteger() {

        List<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(List.of(3, 4, -1, 1));
        int lowestNum = 2;

        int minNum = Collections.min(arr);
        int maxNum = Collections.max(arr);

        //fill list starting from 1 to maxNum inclusive
        for (int i = 1; i < maxNum; i++) {
            list.add(i);
        }

        //remove the array numbers from list
        for (Integer i : arr) {
            list.remove(i);
        }

        //find the first integer in the list and compare to lowestNum
        assertEquals(lowestNum, list.get(0));



    }

}
