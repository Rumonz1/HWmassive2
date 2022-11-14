import java.util.Arrays;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //Задание 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        String a = Arrays.toString(arr);
        int sum = 0;
        for (int month: arr
             ) {
            sum += month;
        }
        System.out.println(a);
        System.out.println(sum);
    }
}