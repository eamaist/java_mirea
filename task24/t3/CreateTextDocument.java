package task24.t3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Создан новый текстовый документ");
        return new TextDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Открыт существующий текстовый документ");
        return new TextDocument();
    }
}
