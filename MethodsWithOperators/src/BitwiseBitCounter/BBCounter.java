package BitwiseBitCounter;

import java.util.Scanner;

public class BBCounter {

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int num = scanner.nextInt();
            int setBitCount = countSetBits(num);
            System.out.println("Number of set bits: " + setBitCount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
