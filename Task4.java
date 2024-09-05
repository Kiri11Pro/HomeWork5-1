import java.util.Scanner;
public class Task4 {
    //    Ввести строку с клавиатуры (латиницей). Из введенной
//    строки выбрать все слова, начинающиеся на гласные буквы
//    и заканчивающиеся на согласные. Вывести отобранные
//    слова на консоль.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Введите строку");
        input = scan.nextLine();
        String newString = input.replaceAll("\\pP", "");
        String[] words = newString.split(" ");
        String[] letters;
        String[] vowel = {"а", "о", "у", "э", "и", "ы", "е", "ё", "я", "ю"};
        String[] cons = {"б", "в", "г", "д", "ж", "з", "й", "к", "л", "м", "н", "п", "р", "с", "т", "ф", "х", "ц", "ч", "ш", "щ"};
        for (int i = 0; i < words.length; i++) {
            letters = words[i].split("");
            for (int j = 0; j < vowel.length; j++) {
                if (letters[0].equalsIgnoreCase(vowel[j])) {
                    for (int k = 0; k < cons.length; k++) {
                        if (letters[(letters.length - 1)].equalsIgnoreCase(cons[k])) {
                            System.out.println(words[i]);
                        }
                    }
                }
            }
        }
    }
}
