package task24.t3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument CreateNew() {
        System.out.println("Создан новый звуковой документ");
        return new MusicDocument();
    }

    @Override
    public IDocument CreateOpen() {
        System.out.println("Открыт существующий звуковой документ");
        return new MusicDocument();
    }
}
