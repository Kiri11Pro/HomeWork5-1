import java.util.Scanner;

public class Task3 {
    //    Подсчитать среднюю длину слова, во введенном с
//    клавиатуры предложении.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenghtString, countWord;
        double avl;
        System.out.println("Введите предложение");
        String input = scan.nextLine();
        String newString = input.replaceAll("[\\pP\\s]", "");
        countWord = 1;
        lenghtString = newString.length();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '\s') {
                countWord++;
            }
        }
        avl = (double) lenghtString / countWord;
        System.out.println(newString);
        System.out.printf("Средняя длина слова - " + "%.1f", avl);

    }
}