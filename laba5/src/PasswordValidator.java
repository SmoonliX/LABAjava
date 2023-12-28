import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Пароль корректен.");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }

    private static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
        return Pattern.matches(regex, password);
    }
}