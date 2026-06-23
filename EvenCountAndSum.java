import java.util.Scanner;

public class EvenCountAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                sum = sum + arr[i];
            }
        }

        System.out.println("Count of even numbers: " + count);
        System.out.println("Sum of even numbers: " + sum);
    }
}
