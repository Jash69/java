import java.util.Scanner;

public class highest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int highest = numbers[0];

        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
        }

        System.out.println("Highest number in the array: " + highest);
    }
}
