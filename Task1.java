import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index, index2, count;
        String str, symbol;
        System.out.println("Введите строку текста");
        str = scan.nextLine();
        System.out.println("Введите символ");
        symbol = scan.nextLine();
        index2 = str.lastIndexOf(symbol);
        count = 0;
        for (index = str.indexOf(symbol); index <= index2; index = (str.indexOf(symbol, index) + 1)) {
            if (index == -1) {
                System.out.println("Совпадений не найдено");
                break;
            }
            count++;
        }
        if (count > 0) {
            System.out.println(count);
        }
    }
}
