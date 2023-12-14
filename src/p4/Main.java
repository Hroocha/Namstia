package p4;

public class Main {
    public static void main(String[] args) {
        int x = 13;
        int y = 5;
        printBinary(x);
        printBinary(y);
        printBinary(~x);
        printBinary(x & y);
        printBinary( x | y);
        printBinary(x ^ y);
        printBinary(Integer.MIN_VALUE + 1);
        printBinary((Integer.MIN_VALUE + 1) >> 1);
        printBinary((Integer.MIN_VALUE + 1) >>> 1);
        printBinary(Integer.MIN_VALUE/2);
        printBinary((Integer.MIN_VALUE/2) << 1);
    }

    private static void printBinary(int x) {
        System.out.println( x+ ":\n" + String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));
    }
}
