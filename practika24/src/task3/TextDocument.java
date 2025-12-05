// task3/TextDocument.java
public class TextDocument implements IDocument {
    private String content = "Пустой текстовый документ";

    @Override public void open()  { System.out.println("Открыт текстовый документ"); }
    @Override public void save()  { System.out.println("Сохранён как .txt"); }
    @Override public void close() { System.out.println("Текстовый документ закрыт"); }
    @Override public String getContent() { return content; }
}