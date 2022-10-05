import java.util.Iterator;

public class FibonacciGenerator implements Iterator<Integer> {
    private int max;
    private int n = 0;
    private int a = 0;
    private int b = 1;

    FibonacciGenerator(int max) {
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return n < max;
    }

    @Override
    public Integer next() {
        int x;
        if (n == 0)
            x = 0;
        else
            x = a + b;

        a = b;
        b = x;
        n++;
        return x;

    }
}

And update Fibonacci.main:

public static void main(String[] args) {
    int n = parseArgs(args);
    if (n == -1) {
        System.err.println("Invalid Arguments");
        return;
    }

    FibonacciGenerator fibonacciGenerator = new FibonacciGenerator(n);
    while (fibonacciGenerator.hasNext()) {
        System.out.print(fibonacciGenerator.next() + ", ");
    }
    System.out.println();
}
