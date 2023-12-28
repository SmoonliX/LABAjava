import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_from {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\SmileX\\Desktop\\ITiP\\Laba4\\src\\";
        String destinationFilePath = "C:\\Users\\SmileX\\Desktop\\ITiP\\Laba4\\src\\Copy_to";

        try (
                FileInputStream fis = new FileInputStream(sourceFilePath);
                FileOutputStream fos = new FileOutputStream(destinationFilePath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.err.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}
