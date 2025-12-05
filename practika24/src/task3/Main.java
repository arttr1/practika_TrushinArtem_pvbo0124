// task3/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск текстового редактора (паттерн Фабричный метод)");
        EditorFrame editor = new EditorFrame(new CreateTextDocument());
        editor.run();
    }
}