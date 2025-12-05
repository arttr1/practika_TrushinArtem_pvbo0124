// task3/CreateTextDocument.java
public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        TextDocument doc = new TextDocument();
        doc.open();
        return doc;
    }

    @Override
    public IDocument createOpen() {
        TextDocument doc = new TextDocument();
        doc.setContent("Загруженный текст из файла...");
        doc.open();
        return doc;
    }
}