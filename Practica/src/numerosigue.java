public class numerosigue {
    public static void main(String args[]) {
        int[] series = {5, 10, 20, 35, 55};
        int lastDifference = series[series.length - 1] - series[series.length - 2];
        int nextNumber = series[series.length - 1] + (lastDifference + 5);

        System.out.println("El siguiente numero es : " + nextNumber);
    }
}