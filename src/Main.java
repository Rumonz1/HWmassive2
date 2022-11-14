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
        //Задание 2
        int min = 200000;
        int max = 100000;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма трат за день составила "+max+" рублей");
        //Задание 3

    }
}