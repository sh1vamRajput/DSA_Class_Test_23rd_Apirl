
import java.util.*;

public class Generate {  // Corrected class name
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 2; 
        List<String> combinations = generateParenthesis(n);
        System.out.println("All combinations of " + n + " pairs of parentheses:");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
