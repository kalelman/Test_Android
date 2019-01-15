import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Eick Rojas Perez</br><br>erick_rojas_perez@hotmail.com</br>
 * @date January/14/2019
 *
 */
// Exercise 1:
// - Input String: "Hello"
// - Output char array: ['H', 'e', 'l', 'l', 'o']
// Exercise 2:
// - Input char array: ['H', 'e', 'l', 'l', 'o']
// - Output (reversed) char array: ['o', 'l', 'l', 'e', 'H']
// Exercise 3:
// - Input char array: ['o', 'l', 'l', 'e', 'H']
// - Output (no-repeating) char array: ['o', 'l', 'e', 'H']
public class MyCode {

    public static void main(String args[]) {

        char[] result1 = exercise1("Hello");
        System.out.println(Arrays.toString(result1));
        char[] result2 = exercise2(result1);
        System.out.println(Arrays.toString(result2));
        char[] result3 = exercise3(result2);
        System.out.println(Arrays.toString(result3));
    }

    private static char[] exercise1(String input) {
        // convert String input into Char Array
        char[] word = input.toCharArray();
        return word; // return the char Array word
    }

    private static char[] exercise2(char[] input) {
        // we use a StringBuilder for the char[] and reverse then convert to String and finally convert to char Array again
        char[] reversed = new StringBuilder(new String(input)).reverse().toString().toCharArray();
        return reversed;
    }

    private static char[] exercise3(char[] input) {
        // we declare a StringBuilder sb
        StringBuilder sb = new StringBuilder();
        // we use a HashSet
        Set set = new HashSet();// a set only accept unique elements
        for (char c : input ) {//
            if (!set.contains(c)) { // hence in each iteration the existence of the character is checked in the set
                set.add(c);
                sb.append(c);
            }
        }
        // convert sb into a char Array and return
        char[] result = sb.toString().toCharArray();

        return result;
    }

}