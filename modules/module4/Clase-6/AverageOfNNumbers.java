import java.util.Scanner;

public class AverageOfNNumbers {
    //Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = getNumbers();
        int result = calculateAverage(numbers);
        System.out.println("Average is: " + result);
    }

    public static int[] getNumbers() {
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number " + (i + 1) + ":");
            numbers[i] += sc.nextInt();
        }
        return numbers;
    }

    public static int calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
