package a05;

/**
 *
 * @author Rakhuzhuwo Sapruna (A00455075)
 */
public class MoreMath {
    /**
     * 
     * @return the name of the author 
     */
    public static String authorName() {
        return "Rakhuzhuwo Sapruna";
    }
    /**
     * 
     * @return the A number
     */
    public static String authorNumber() {
        return "A00455075";
    }
    /**
     * 
     * @param n is the log base 2 .
     * @return the log function
     */
    public static double log2(double n) {
        return Math.log(n) / Math.log(2);
    }
    /**
     * 
     * @param n is an Integer
     * @return random Integer 
     */
    public static int randomInt(int n) {
        return 1 + (int)(n * Math.random());
    }
    /**
     * 
     * @param n number of factorial
     * @return factor returns the factorial
     */
    public static int factorial(int n) {
        int factor = 1;
        for(int i = 1; i <= n; i++){
            factor *= i;
        }
        return factor;
    }
    /**
     * 
     * @param count is the count of Fibonacci number to sum
     * @return sum of the fibonacciSum
     */
    public static int fibonacciSum(int count) {
        int sum = 1;
        int fibonacciNumber1 = 0;
        int fibonacciNumber2 = 1;
        
        if(count <= 1){
            return 0;
        }
        else{
            int next;
            for(int i = 1; i < count; i++){
                sum = fibonacciNumber1 + fibonacciNumber2;
                
                fibonacciNumber1 = fibonacciNumber2;
                fibonacciNumber2 = sum;
                
            }
        }
        return sum;
    }
    
}
