import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * The test class JudgingTest.
 *
 * @author  David J. Barnes
 * @version 2021.10.20
 */
public class JudgingTest
{
    // Catch the output from System.out and System.err.
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    // Error report, if any.
    private String report;
    private static ReflectionTester reflect;
    // The name of the class being tested.
    private static final String CLASS_NAME = "Judging";
    // The fields: name and type.
    private static final String[] fields = {
            "F:votes:int",
            "F:judges:int",
            "F:name:java.lang.String",
        };
    // The methods: name, return type, params.
    private static final String[] methods = {
            "M:getVotes:int:",
            "M:getJudges:int:",
            "M:getName:java.lang.String:",
            "M:vote:void:int",
            "M:getDetails:java.lang.String:",
            "M:positive:boolean:"
        };

    private Judging personToTest;
    private static final String PARTICIPANT_NAME = "Dirk Gently";

    /**
     * Default constructor for test class JudgingTest
     */
    public JudgingTest()
    {
    }

    @BeforeAll
    public static void reflectionTest()
    {
        try {
            reflect = new ReflectionTester(CLASS_NAME);
        }
        catch(ClassNotFoundException ex) {
            // Class name not found.
            assertTrue(false, "The class must be called Judging.");
        }
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
        report = null;

        personToTest = new Judging(PARTICIPANT_NAME);
    }

    /**
     * Test for the correct class name.
     */
    @Test
    public void testClassName()
    {
        assertTrue(reflect != null, "The class must be called " + CLASS_NAME);
    }

    /**
     * Test for the correct fields.
     */
    @Test
    public void testFields()
    {
        if(reflect != null) {
            String fieldReport = reflect.testFields(fields);
            if(! fieldReport.isEmpty()) {
                fail(fieldReport);
            }
        }
        else {
            fail("Requirements for the fields cannot be checked until the name of the class is correct.");
        }
    }

    /**
     * Test for the correct methods.
     */
    @Test
    public void testMethods()
    {
        if(reflect != null) {
            String methodReport = reflect.testMethods(methods);
            if(! methodReport.isEmpty()) {
                fail(methodReport);
            }
        }
        else {
            fail("Requirements for the methods cannot be checked until the name of the class is correct.");
        }
    }

    /**
     * Test the initial state of a newly-created Judging.
     */
    @Test
    public void testInitialState()
    {
        assertEquals(PARTICIPANT_NAME, personToTest.getName());
        assertEquals(0, personToTest.getVotes());
        assertEquals(0, personToTest.getJudges());
    }

    /**
     * Check getDetails for the initial state.
     */
    @Test
    public void checkInitialDetails()
    {
        String details = personToTest.getDetails();
        assertEquals(
            String.format("%s has 0 votes from 0 judges", PARTICIPANT_NAME),
            details.trim());
    }

    /**
     * Test the like() method.
     */
    @Test
    public void testGetVotes()
    {
        personToTest.vote(5);
        assertEquals(5, personToTest.getVotes());
    }

    /**
     * Test the like() method.
     */
    @Test
    public void testGetJudges()
    {
        personToTest.vote(5);
        assertEquals(1, personToTest.getJudges());
    }

    /**
     * Check getDetails for the initial state.
     */
    @Test
    public void checkDetailsOneJudge()
    {
        personToTest.vote(5);
        String details = personToTest.getDetails().trim();
        // Be flexible about plural.
        if(details.endsWith("s")) {
            assertEquals(String.format("%s has 5 votes from 1 judges", 
                    PARTICIPANT_NAME), details);            
        }
        else if(details.endsWith("e")) {
            assertEquals(
                String.format("%s has 5 votes from 1 judge",
                    PARTICIPANT_NAME), details);

        }
        else {
            assertEquals(
                String.format("%s has 5 votes from 1 judges",
                    PARTICIPANT_NAME), details);
        }
    }

    /**
     * Check getDetails for the initial state.
     */
    @Test
    public void checkDetailsTwoJudges()
    {
        personToTest.vote(3);
        personToTest.vote(6);
        String details = personToTest.getDetails().trim();
        // Be strict about formatting.
        assertEquals(
            String.format("%s has 9 votes from 2 judges", PARTICIPANT_NAME),
            details);
    }

    /**
     * Test whether the vote method correctly updates
     * the votes and judges.
     */
    @Test
    public void testVote1()
    {
        personToTest.vote(1);
        assertEquals(1, personToTest.getVotes());
        assertEquals(1, personToTest.getJudges());
    }

    /**
     * Test whether the vote method correctly updates
     * the votes and judges.
     */
    @Test
    public void testVote2()
    {
        personToTest.vote(2);
        assertEquals(2, personToTest.getVotes());
        assertEquals(1, personToTest.getJudges());
    }

    /**
     * Test whether the vote method correctly updates
     * the votes and judges.
     */
    @Test
    public void testVote3()
    {
        personToTest.vote(3);
        personToTest.vote(3);
        assertEquals(6, personToTest.getVotes());
        assertEquals(2, personToTest.getJudges());
    }

    /**
     * Test whether the vote method correctly rejects
     * an illegal vote.
     */
    @Test
    public void testVote12()
    {
        personToTest.vote(12);
        assertEquals(0, personToTest.getVotes());
        assertEquals(0, personToTest.getJudges());
        assertTrue(checkOutput("12 is an illegal number of votes", "the vote method"));
    }

    /**
     * Test whether the vote method correctly rejects
     * an illegal vote.
     */
    @Test
    public void testVoteNegative()
    {
        personToTest.vote(-6);
        assertEquals(0, personToTest.getVotes());
        assertEquals(0, personToTest.getJudges());
        assertTrue(checkOutput("-6 is an illegal number of votes", "the vote method"));
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive1()
    {
        assertFalse(personToTest.positive());
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive2()
    {
        personToTest.vote(6);
        assertTrue(personToTest.positive());
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive3()
    {
        personToTest.vote(5);
        assertFalse(personToTest.positive());
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive4()
    {
        personToTest.vote(4);
        assertFalse(personToTest.positive());
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive5()
    {
        personToTest.vote(5);
        personToTest.vote(6);
        assertTrue(personToTest.positive());
    }

    /**
     * Test whether the participant has a positive rating.
     */
    @Test
    public void testPositive6()
    {
        personToTest.vote(5);
        personToTest.vote(5);
        personToTest.vote(5);
        assertFalse(personToTest.positive());
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.setOut(originalOut);
        System.setErr(originalErr);
        if(report != null) {
            System.err.println(report);
            report = null;
        }

        personToTest = null;
    }

    /**
     * Check whether what was output by the Judging object matched
     * what was expected.
     * If they don't match, set the report field.
     * @param expectedOutput What is expected.
     */
    private boolean checkOutput(String expectedOutput, String context)
    {
        String actualOutput = outContent.toString().trim()
            + errContent.toString().trim();
        if(!expectedOutput.equals(actualOutput)) {
            StringBuilder builder = new StringBuilder();
            builder.append("In a test of ").append(context).append('\n');
            builder.append("Expected output should be something like: ")
            .append(expectedOutput).append("\n")
            .append("    Actual output was: ")
            .append(actualOutput);
            report = builder.toString();
            return false;
        }
        else {
            report = null;
            return true;
        }            
    }

    /**
     * Driver for Java assignment analyser.
     * Requirements for fields and methods are defined here.
     * 
     * @author djb
     */
    private static class ReflectionTester {
        private Reflector reflector;

        /**
         * Create a tester for the given class.
         * @param subject The name of the class to be tested.
         */
        public ReflectionTester(String subject)
        throws ClassNotFoundException
        {
            reflector = new Reflector(subject);
        }

        /**
         * Test the fields given their descriptions.
         * Return a report of any issues found.
         * @param fields Descriptions of the required fields.
         * @return A report string, or blank if there are no issues.
         */
        public String testFields(String[] fields)
        {
            try {
                RequiredField[] requiredFields = setupFields(fields);
                return reflector.checkFields(requiredFields);
            }
            catch(ClassNotFoundException ex) {
                return null;
            }
        }

        /**
         * Test the public methods given their descriptions.
         * Return a report of any issues found.
         * @param methods Descriptions of the public methods.
         * @return A report string, or blank if there are no issues.
         */
        public String testMethods(String[] methods)
        {
            try {
                RequiredMethod[] requiredMethods = setupMethods(methods);
                return reflector.checkMethods(requiredMethods);
            }
            catch(ClassNotFoundException ex) {
                return null;
            }

        }

        /**
         * Set up the required fields from the name and type info.
         * @param fields F:name:type for each field.
         * @return an array of RequiredField details.
         * @throws ClassNotFoundException if a type cannot be found.
         */
        private static RequiredField[] setupFields(String[] fields) throws ClassNotFoundException
        {
            RequiredField[] requiredFields = new RequiredField[fields.length];
            for(int i = 0; i < fields.length; i++) {
                String f = fields[i];
                String[] parts = f.split(":");
                assert parts[0].equals("F");
                assert parts.length == 3;
                requiredFields[i] = new RequiredField(parts[1], getClass(parts[2]));
            }
            return requiredFields;
        }

        /**
         * Set up the required methods from the given info.
         * @param fields M:name:return-type:param-types for each field.
         * @return an array of RequiredMethod details.
         * @throws ClassNotFoundException if a type cannot be found.
         */
        private static RequiredMethod[] setupMethods(String[] methods) 
        throws ClassNotFoundException
        {
            RequiredMethod[] requiredMethods = new RequiredMethod[methods.length];
            for(int i = 0; i < methods.length; i++) {
                String m = methods[i];
                String[] parts = m.split(":");
                assert parts[0].equals("M");
                assert parts.length >= 3 : m + " " + parts.length;
                Class[] params = new Class[parts.length - 3];
                for(int p = 3; p < parts.length; p++) {
                    params[p - 3] = getClass(parts[p]);
                }
                requiredMethods[i] = 
                new RequiredMethod(parts[1],
                    getClass(parts[2]), 
                    params);
            }
            return requiredMethods;

        }

        /**
         * Get the Class object corresponding to the given type name.
         * @param typeName The type to be found.
         * @return The Class object for the type.
         * @throws ClassNotFoundException if the Class cannot be found.
         */
        private static Class getClass(String typeName) throws ClassNotFoundException
        {
            switch(typeName) {
                case "boolean": return boolean.class;
                case "byte": return byte.class;
                case "double": return double.class;
                case "float": return float.class;
                case "int": return int.class;
                case "long": return long.class;
                case "short": return short.class;
                case "void": return void.class;
                default:
                    return Class.forName(typeName);
            }
        }
        /**
         * Details of a required field: its name and type.
         * @author djb
         */
        private static class RequiredField {
            private final String name;
            private final Class type;

            /**
             * Store details of a required field.
             * @param name The name of the field.
             * @param type The type of the field.
             */
            public RequiredField(String name, Class type) {
                this.name = name;
                this.type = type;
            }

            /**
             * Get the field's name.
             *
             * @return The field's name.
             */
            public String getName() {
                return name;
            }

            /**
             * Get the field's type.
             *
             * @return The field's type.
             */
            public Class getType() {
                return type;
            }

        }
        /**
         * Details of a required method: its name, return type and parameters.
         * @author djb
         */
        private static class RequiredMethod {
            private final String name;
            private final Class returnType;
            private final Class params[];

            /**
             * Store details of a required public method.
             * @param name The method's name.
             * @param returnType The return type.
             * @param params The method's parameters.
             */
            public RequiredMethod(String name, Class returnType, Class[] params) {
                this.name = name;
                this.returnType = returnType;
                this.params = params;
            }

            /**
             * Get the method's name.
             * @return The method's name.
             */
            public String getName() {
                return name;
            }

            /**
             * Get the method's return type.
             * @return The method's return type.
             */
            public Class getReturnType() {
                return returnType;
            }

            /**
             * Get the method's parameters.
             * @return The method's parameters.
             */
            public Class[] getParams() {
                return params;
            }

        }
        /**
         * Check that the required fields and methods in a class
         * are present.
         * @author djb
         */
        public class Reflector {
            private final Field[] fields;
            private final Method[] methods;
            private final Class targetClass;  

            /**
             * Create a Reflector for the given class.
             * @param className the class to be analysed.
             * @throws ClassNotFoundException if the class cannot be found.
             */
            public Reflector(String className) throws ClassNotFoundException {
                this.targetClass = Class.forName(className);
                this.fields = targetClass.getDeclaredFields();
                this.methods = targetClass.getDeclaredMethods();
            }

            /**
             * Check the required fields.
             * @param requiredFields The required fields.
             */
            public String checkFields(RequiredField[] requiredFields)
            {
                StringBuilder builder = new StringBuilder();
                boolean allOk = true;
                // Whether each has been found in the class.
                boolean[] matched = new boolean[fields.length];

                for(RequiredField f : requiredFields) {
                    // Look for a matching name.
                    String name = f.getName();
                    int index = -1;
                    for(int i = 0; i < matched.length && index < 0; i++) {
                        if(name.equals(fields[i].getName())) {
                            matched[i] = true;
                            index = i;
                        }
                    }
                    if(index >= 0) {
                        // Check that the field is private and
                        // has the correct type.
                        Field field = fields[index];
                        int modifiers = field.getModifiers();
                        if((modifiers & Modifier.PRIVATE) != Modifier.PRIVATE) {
                            builder.append(name + " has not been defined as private.")
                            .append('\n');
                            allOk = false;
                        }
                        if(field.getType() != f.getType()) {
                            builder.append(name + " does not have the correct type.")
                            .append('\n');
                            allOk = false;
                        }
                    }
                    else {
                        builder.append(name + " not defined as a field.")
                        .append('\n');
                        allOk = false;
                    }
                }
                // Report on any missing fields.
                for(int i = 0; i < matched.length; i++) {
                    if(! matched[i]) {
                        builder.append(fields[i].getName() + 
                            " does not match a required field.")
                        .append('\n');
                        allOk = false;
                    }
                }
                return builder.toString().trim();
            }

            /**
             * Check the required methods.
             * @param requiredMethods The required methods.
             */
            public String checkMethods(RequiredMethod[] requiredMethods)
            {
                StringBuilder builder = new StringBuilder();
                boolean allOk = true;
                // Whether each has been found in the class.
                boolean[] matched = new boolean[methods.length];

                for(RequiredMethod m : requiredMethods) {
                    // Look for a matching name.
                    String name = m.getName();
                    int index = -1;
                    for(int i = 0; i < matched.length && index < 0; i++) {
                        if(name.equals(methods[i].getName())) {
                            matched[i] = true;
                            index = i;
                        }
                    }
                    if(index >= 0) {
                        // Check that the method is public,
                        // has the correct return type and params.
                        Method method = methods[index];
                        int modifiers = method.getModifiers();
                        if((modifiers & Modifier.PUBLIC) != Modifier.PUBLIC) {
                            builder.append(name + " has not been defined as public.")
                            .append('\n');
                        }
                        if(method.getReturnType() != m.getReturnType()) {
                            builder.append(name + " does not have the correct return type.")
                            .append('\n');
                            allOk = false;
                        }
                        Class[] params = method.getParameterTypes();
                        Class[] requiredParams = m.getParams();
                        if(params.length == requiredParams.length) {
                            boolean ok = true;
                            for(int p = 0; p < requiredParams.length; p++) {
                                if(params[p] != requiredParams[p]) {
                                    ok = false;
                                }
                            }
                            if(!ok) {
                                builder.append("The parameters of " + name + 
                                    " do not all have the correct type.")
                                .append('\n');
                                allOk = false;
                            }
                        }
                        else {
                            builder.append(name + " should have " +
                                requiredParams.length + " instead of " +
                                params.length + " parameters.")
                            .append('\n');
                            allOk = false;
                        }
                    }
                    else {
                        builder.append(name + " not defined as a method.")
                        .append('\n');
                        allOk = false;
                    }
                }
                // Report on any missing methods.
                for(int i = 0; i < matched.length; i++) {
                    if(! matched[i]) {
                        Method method = methods[i];
                        int modifiers = method.getModifiers();
                        if((modifiers & Modifier.PUBLIC) == Modifier.PUBLIC) {
                            builder.append(methods[i].getName() + 
                                " does not match a required public method.")
                            .append('\n');
                            allOk = false;
                        }
                    }
                }
                return builder.toString().trim();
            }

        }
    }

}
