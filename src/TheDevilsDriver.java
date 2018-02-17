/**
 * This is a driver class with the main method to test the program.
 * 
 * @author Leul Amare
 * @version January 10
 */
final class TheDevilsDriver {
    /**
     * prevent instantiation.
     */
    private TheDevilsDriver() {
        
    }

    /**
     * 
     * @param theArgs nothing has been passed. 
     */
    public static void main(final String[] theArgs) {

        final TheDevilsNumber a = new TheDevilsNumber();

        final int sum = a.addAllnumbers();
        
        /*
         * Displays some information about the program.
         */
        System.out.println("The following number believes to be the devil number.");
        System.out.println("In fact, if we add all the numbers from 0 to 9 without repeating, "
                        + "we can find the sum");
        
        System.out.println(sum);
    }

}

