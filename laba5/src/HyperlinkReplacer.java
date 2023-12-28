import java.util.regex.*;

public class HyperlinkReplacer {
    public static void main(String[] args) {
        String text = "большие выйгрыши -> https://www.loxotron";
        String regex = "(http[s]?://\\S+)";
        String replacedText = text.replaceAll(regex, "$1");
        System.out.println(replacedText);
    }
}
