import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "1.23 что -1 такое доброта 12000 э123то 0.222";
        Pattern pattern = Pattern.compile("-?\\d+\\.\\d+|-?\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}