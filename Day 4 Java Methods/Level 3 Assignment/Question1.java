public class Question1 {

    public static int SumOfHeight (int[] arr) {
        int sum  = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double MeanHeight (int num) {
        return (double) num / 11;
    }

    public static int ShortestHeight (int[] arr) {
        int shortest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            shortest = Math.min(shortest, arr[i]);
        }
        return shortest;
    }

    public static int TallestHeight (int[] arr) {
        int tallest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            tallest = Math.max(tallest, arr[i]);
        }
        return tallest;
    }

    public static void main (String[] Args) {
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101 + 150);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Random Heights for player " + (i+1) + ": " + arr[i]);
        }

        int sum = SumOfHeight(arr);
        double mean = MeanHeight(sum);
        int smallest = ShortestHeight(arr);
        int tallest = TallestHeight(arr);

        System.out.println("Sum of the height: " + sum);
        System.out.printf("Mean height: %.2f\n" , mean);
        System.out.println("Shortest Player: " + smallest);
        System.out.println("Tallest Player: " + tallest);
    }
}
