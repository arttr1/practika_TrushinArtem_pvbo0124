import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> files = DirectoryLister.listDirectory(".");
            DirectoryLister.printFirst5(files);
        } catch (IOException e) {
            System.err.println("Ошибка чтения каталога: " + e.getMessage());
        }
    }
}