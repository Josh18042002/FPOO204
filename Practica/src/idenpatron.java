import java.util.List;
import java.util.Arrays;


public class idenpatron {
    public static void main ( String args[] ){
        List<String> words = Arrays.asList("ojo", "oso", "araña", "radar");
        boolean isPalindrome = true;

        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (!word.equals(reversed)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Todas las palabras son palíndromos: " + isPalindrome);
    }
}
