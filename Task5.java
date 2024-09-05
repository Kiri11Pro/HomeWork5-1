import java.util.Scanner;

public class Task5 {
    //    Ввести строку с клавиатуры.В строке должны содержаться
//    слова, которые могут быть раздельные пробелами или
//    двоеточиями. Необходимо вычислить количество слов в
//    строке, у которых четное количество букв.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Введите строку");
        input = scan.nextLine();
        String newString = input.replaceAll("\\pP", "");
        String[] words = newString.split(" ");
        String[] letters;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            letters = words[i].split("");
            if (letters.length % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
        
