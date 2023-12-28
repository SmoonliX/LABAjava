import java.io.FileWriter;
import java.io.IOException;

class CustomEmailFormatException extends Exception {
    public CustomEmailFormatException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void main(String[] args) {
        String email = "love_is@gmail.1opp";

        try {
            validateEmail(email);
            System.out.println("Email корректен.");
        } catch (CustomEmailFormatException e) {
            logException(e);
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static void validateEmail(String email) throws CustomEmailFormatException {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new CustomEmailFormatException("Недопустимый формат email-адреса: " + email);
        }
    }

    private static void logException(Exception e) {
        try (FileWriter writer = new FileWriter("exception_log.txt", true)) {
            writer.write("Exception: " + e.getClass().getSimpleName() + "\n");
            writer.write("Message: " + e.getMessage() + "\n");
            writer.write("StackTrace: \n");
            for (StackTraceElement element : e.getStackTrace()) {
                writer.write("\t" + element.toString() + "\n");
            }
            writer.write("\n");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
