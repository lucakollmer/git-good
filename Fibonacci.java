public class Fibonacci {

    public static void main(String[] args) {
        int n = parseArgs(args);
        if (n == -1) {
            System.err.println("Invalid Arguments");
            return;
        }

        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        for (int i = 0; i < n - 1; i++) {
            System.out.print(fibonacciCalculator.calculate(i) + ", ");
        }
        System.out.println(fibonacciCalculator.calculate(n - 1));
    }

    private static Integer parseArgs(String[] args) {
        if (args.length != 1 || args[0] == null)
            return -1;

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return -1;
        }

        if (n <= 0)
            return -1;
        return n;
    }
}