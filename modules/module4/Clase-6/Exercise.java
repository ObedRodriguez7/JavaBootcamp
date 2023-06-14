public class Exercise {
    //Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
    public static void main(String[] args) {
        int[] numbers = {23, 40, 60, -8, 2, 10, 4, -5};
        int smallest = getSmallestNumber(numbers);
        int largest = getLargestNumber(numbers);
        System.out.println("largest is: " + largest);
        System.out.println("smallest is: " + smallest);
    }

    public static int getLargestNumber(int[] numbers) {
        int largest = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num >= largest || i == 0) {
                largest = num;
            }
        }
        return largest;
    }

    public static int getSmallestNumber(int[] numbers) {
        int smallest = 0;
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num <= smallest || i == 0) {
                smallest = num;
            }
        }
        return smallest;
    }
}
