package task24.t3;

public class TextDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("Текстовый документ открыт");
    }
    @Override
    public void close() {
        System.out.println("Текстовый документ закрыт");
    }
    @Override
    public void save() {
        System.out.println("Текстовый документ сохранен");
    }
}
