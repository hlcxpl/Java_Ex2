public class Fibonacci {
    public int[] generateFibonacci(int n) {
        int[] series = new int[n];
        if (n > 0)
            series[0] = 0;
        if (n > 1)
            series[1] = 1;
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int[] fibonacciSeries = fibonacci.generateFibonacci(10);
        System.out.print("Fibonacci series: ");
        for (int num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }
}