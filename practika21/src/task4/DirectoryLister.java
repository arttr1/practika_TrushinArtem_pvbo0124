import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class DirectoryLister {
    public static List<String> listDirectory(String path) throws IOException {
        Path dir = Paths.get(path);
        if (!Files.isDirectory(dir)) {
            throw new IllegalArgumentException("Not a directory: " + path);
        }
        try (var stream = Files.list(dir)) {
            return stream
                    .map(p -> p.getFileName().toString())
                    .collect(Collectors.toList());
        }
    }

    public static void printFirst5(List<String> items) {
        System.out.println("Первые 5 элементов:");
        for (int i = 0; i < Math.min(5, items.size()); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}