// task3/EditorFrame.java
import java.util.Scanner;

public class EditorFrame {
    private IDocument currentDocument;
    private ICreateDocument factory;
    private final Scanner scanner = new Scanner(System.in);

    public EditorFrame(ICreateDocument factory) {
        this.factory = factory;
    }

    public void run() {
        System.out.println("=== Редактор запущен ===");
        boolean exit = false;
        while (!exit) {
            System.out.println("\nМеню:");
            System.out.println("1. New");
            System.out.println("2. Open");
            System.out.println("3. Save");
            System.out.println("4. Close");
            System.out.println("5. Exit");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    if (currentDocument != null) currentDocument.close();
                    currentDocument = factory.createNew();
                    break;
                case "2":
                    if (currentDocument != null) currentDocument.close();
                    currentDocument = factory.createOpen();
                    break;
                case "3":
                    if (currentDocument != null) currentDocument.save();
                    else System.out.println("Нет открытого документа");
                    break;
                case "4":
                    if (currentDocument != null) {
                        currentDocument.close();
                        currentDocument = null;
                    } else {
                        System.out.println("Нет открытого документа");
                    }
                    break;
                case "5":
                    exit = true;
                    if (currentDocument != null) currentDocument.close();
                    System.out.println("Редактор завершён.");
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}