package task24.t3;

public class Test {
    public static void main(String[] args) {
        ICreateDocument iCreateDocument = new CreateTextDocument();
        DocEditorGUI editor = new DocEditorGUI(iCreateDocument);
        editor.setVisible(true);
    }
}
