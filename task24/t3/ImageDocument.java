package task24.t3;

public class ImageDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Изобразительный документ открыт");
    }
    @Override
    public void close() {
        System.out.println("Изобразительный документ закрыт");
    }
    @Override
    public void save() {
        System.out.println("Изобразительный документ сохранен");
    }
}
