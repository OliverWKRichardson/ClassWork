import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * NB: DO NOT MODIFY THE METHOD NAMES, RETURN TYPES OR
 * PARAMETERS IN THIS CLASS IN ANY WAY.
 * 
 * Manage a collection of infection test results.
 *
 * @author (Oliver Richardson)
 * @version (3/11/21)
 */
public class InfectionResults
{
    // Create an arraylist called tests
    ArrayList<InfectionTest> tests;
    /**
     * Constructor for objects of class InfectionResults
     */
    public InfectionResults()
    {
        // Initialise the array list called tests
        tests  = new ArrayList<InfectionTest>();
    }

    /**
     * Add the given test to the collection.
     * @param test The test to be added.
     */
    public void addTest(InfectionTest test)
    {
        // Adds the given test to the tests array list
        tests.add(test);
    }

    /**
     * Get the number of tests currently stored.
     * @return the number of tests.
     */
    public int getNumberOfTests()
    {
        // returns the size of the tests array list
        return tests.size();
    }

    /**
     * List the tests in the collection.
     */
    public void list()
    {
        // Iterate through the test items in the tests array list
        for(InfectionTest tempTest : tests)
        {
            // print the details of the current test
            System.out.println(tempTest.getDetails());
        }
    }

    /**
     * Set the status of the given test.
     * If a test with the id is not found no action is required
     * and no error message should be printed.
     * @param id The id of the test.
     * @param positive Whether the test is positive or not.
     */
    public void setStatus(String id, boolean positive)
    {
        // Iterate through the test items in the tests array list
        for(InfectionTest tempTest : tests)
        {
            // If the current tests id is the same as the id that is being looked for
            if(tempTest.getID() == id)
            {
                // set the test as positive
                tempTest.setStatus(positive);
            }
        }
    }

    /**
     * Find the test (if any) with the given id.
     * @return The test with the given id, or null if
     *         none matches.
     */
    public InfectionTest findTest(String id)
    {
        // Iterate through the test items in the tests array list
        for(InfectionTest tempTest : tests)
        {
            // If the current tests id is the same as the id that is being looked for
            if(tempTest.getID() == id)
            {
                // return the test
                return tempTest;
            }
        }
        // If no matching id is found return null
        return null;
    }

    /**
     * Return all the positive tests.
     * @return the positive tests.
     */
    public HashSet<InfectionTest> getPositiveTests()
    {
        // Create a infection test hash set called positive tests
        HashSet<InfectionTest> positiveTests = new HashSet();  
        // Iterate through the test items in the tests array list
        for(InfectionTest tempTest : tests)
        {
            // If the test if positive
            if(tempTest.isKnown() && tempTest.isPositive())
            {
                // add the test to positive tests hash set
                positiveTests.add(tempTest);    
            }
        }
        // Return the positive tests hash set
        return positiveTests;
    }

    /**
     * Remove all the tests with unknown status and return
     * those that were removed.
     * @return the removed tests.
     */
    public LinkedList<InfectionTest> removeUnknownStatus()
    {
        // Create a linked list to store the items that are removed
        LinkedList<InfectionTest> removedItems = new LinkedList<InfectionTest>();
        // Create a integer to use to iterate in the while loop
        int index = 0;
        // Iterate through the tests
        while(index < tests.size())
        {
            // If the the test is unknown
            if(!tests.get(index).isKnown())
            {
                // Add it to items to remove linked list
                removedItems.add(tests.get(index));
            }
            // Increment the integer for iteration
            index++;
        }
        // Iterate through the tests to remove linked list
        for(InfectionTest test : removedItems)
        {
            // Remove the tests from the main array list
            tests.remove(test);
        }
        // Return the items that have been removed from the main array list
        return removedItems;
    }
}
