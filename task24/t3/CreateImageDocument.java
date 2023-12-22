package task24.t3;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Создан новый изобразительный документ");
        return new ImageDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Открыт существующий изобразительный документ");
        return new ImageDocument();
    }
}
