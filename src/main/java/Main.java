public class Main{

    /*
     ***********************************************
     * This is the driver code. Don't change it!!!
     * *********************************************
     */
    public static void main(String[] args){
        /*
         * Format of the 'args' array: [`<COMMAND_NAME_1> <ARG1> <ARG2> .. <ARG N>`, `<COMMAND_NAME_2> <ARG1> <ARG2> .. <ARG N>`]
         *  Example: ["PLACE_ORDER 101 Apple 5", "TOTAL_COST 101"]
         * 
         * The code evaluator will execute this code by using the command 
         * java -jar dist/lib/dist.jar 'PLACE_ORDER 101 Apple 5' 'TOTAL_COST 101'
         * 
         * We loop through the list of commands passed in as input arguments and handle each one of them
         */
        for (String arg : args) {
            handle(arg);
        }
    }

    /*
     * This method should parse each input and assigns it into different variables.
     * 
     * The value of the function parameter "input" will be of the format - "`<COMMAND_NAME_1> <ARG1> <ARG2> .. <ARG N>". 
     * We split the string and retrieve the input data appropriately into the variable inputListForOneCommand. 
     *  
     */
    private static void handle(String input) {
        String[] inputListForOneCommand = input.trim().split(" ");
        String command = inputListForOneCommand[0]; //This value will hold the command name each time it is called.
        System.out.println(command); //Will print the command Ex: "PLACE_ORDER" or "TOTAL_COST"

        String arg1 = inputListForOneCommand[1]; //This value will hold the first argument value each time it is called. There can be N number of such arguments based on the problem statement. You need to fetch that in a similar fashion based on the problem statement.
        System.out.println(arg1); //Will print the first argument to the command Ex: "101"
        
        /*
         * Implementation of the solution should begin after this. Please make sure you convert the variables into appropriate data types required for the solutioning. 
         */

    }

}
