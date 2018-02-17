/*
 * TCSS 305 – Winter 2018 Assignment 0 – Orientation
 */

/**
 * Many of us heard about the devil number "666". Whether we believe it or not 
 * it's a devil number, the numbers exists as sum of all numbers from 0 -9.
 * This program add all numbers ( 0 - 9) without repeating and 
 * using any other mathematical operation to display the number 666.
 * 
 * @author Leul Amare.
 * 
 * @version January 10.
 * 
 */

public class TheDevilsNumber {
    
    /**
     * Holds the second set of the sum.
     */
    private static final int FIRST_SET = 0;
    
    /**
     * Holds the second set of the sum.
     */
    private static final int SECOND_SET = 123;
    /**
     * Holds the first set of the sum.
     */
    private static final int THIRD_SET = 456;
    /**
     * Holds the third set of the sum.
     */
    private static final int FOURTH_SET = 78;
    /**
     * Holds the fourth set of the sum.
     */
    private static final int FIFTH_SET = 9;

    /**
     * @return returns the sum of all numbers from 0 - 9.
     */
    public int addAllnumbers() {

        int sum = 0;
        sum = FIRST_SET + SECOND_SET + THIRD_SET + FOURTH_SET + FIFTH_SET;
        return sum;

    }
}
