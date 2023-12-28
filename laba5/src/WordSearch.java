import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите букву для поиска слов: ");
        String letterInput = scanner.nextLine();

        if (letterInput.length() != 1) {
            System.out.println("Пожалуйста, введите только одну букву.");
            return;
        }

        char searchLetter = letterInput.toLowerCase().charAt(0);

        String regex = "\\b[" + searchLetter + searchLetter + "]\\p{L}+\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Слова, начинающиеся с буквы '" + searchLetter + "':");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
