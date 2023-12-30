public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) {
                System.out.println(s + " - это палиндром.");
            } else {
                System.out.println(s + " - это не палиндром.");
            }
        }
    }
    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
    public static boolean isPalindrome(String s) {
        // Приводим строку к нижнему регистру и убираем пробелы (если необходимо)
        s = s.toLowerCase().replaceAll("\\s", "");
        // Переворачиваем строку
        String reversed = reverseString(s);
        // Сравниваем исходную строку с перевернутой
        return s.equals(reversed);
    }
}