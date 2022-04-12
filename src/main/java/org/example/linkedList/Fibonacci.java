package org.example.linkedList;

public class Fibonacci {
    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        int p = 1, q = 1, r = 0;
        for (int i = 2; i < n; i++) {
            r = p + q;
            p = q;
            q = r;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
