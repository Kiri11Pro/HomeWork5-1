import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, count, len;
        System.out.println("Введите число");
        n = scan.nextInt();
        String output = "";
        len = 0;
        for (count = 1; count <= n; count++) {
            if (len >= 1000) {
                System.out.println("Начните программу заново и введите число меньше");
                break;
            }
            output = output + count;
            len = output.length();
        }
        if (len == 0) {
            System.out.println(output);
        }
    }
}
