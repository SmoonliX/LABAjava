import java.util.Scanner;
import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите IP-адрес:");
        String ipAddress = scanner.nextLine();

        if (isValidIPAddress(ipAddress)) {
            System.out.println("IP-адрес корректен.");
        } else {
            System.out.println("IP-адрес не соответствует требованиям.");
        }
    }

    private static boolean isValidIPAddress(String ipAddress) {
        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        if (!Pattern.matches(regex, ipAddress)) {
            return false;
        }


        String[] segments = ipAddress.split("\\.");
        for (String segment : segments) {
            if (segment.length() > 1 && segment.startsWith("0")) {
                return false;
            }
        }

        return true;
    }
}
