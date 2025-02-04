public class descifrar {
    public static void main (String args[] ){
        int [] code = {8, 5, 12, 16 };
        StringBuilder word = new StringBuilder();

        for (int number : code) {
            char letter = (char) ('A' + number - 1);
            word.append(letter);
        }

        System.out.println("La palabra es :" + word.toString());
    }
}
