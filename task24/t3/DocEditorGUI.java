package task24.t3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DocEditorGUI extends JFrame {
    private ICreateDocument factory;
    private IDocument doc;
    public DocEditorGUI(ICreateDocument factory){
        this.factory = factory;

        setTitle("TextEditor");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(new Font("", Font.PLAIN, 25));

        JMenuItem newItem = new JMenuItem("New");
        newItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doc = factory.CreateNew();
                doc.open();
            }
        });


        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doc = factory.CreateOpen();
                doc.open();
            }
        });


        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(doc!=null) doc.save();
                else System.out.println("Документ не выбран");
            }
        });


        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doc.close();
                System.exit(0);
            }
        });

        exitItem.setFont(new Font("", Font.PLAIN, 25));
        newItem.setFont(new Font("", Font.PLAIN, 25));
        openItem.setFont(new Font("", Font.PLAIN, 25));
        saveItem.setFont(new Font("", Font.PLAIN, 25));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
    }
}
