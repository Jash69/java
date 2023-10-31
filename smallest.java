import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Smallest number in the array: " + smallest);
    }
}
