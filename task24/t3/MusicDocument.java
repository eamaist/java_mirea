package task24.t3;

public class MusicDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("Звуковой документ открыт");
    }
    @Override
    public void close() {
        System.out.println("Звуковой документ закрыт");
    }
    @Override
    public void save() {
        System.out.println("Звуковой документ сохранен");
    }
}
