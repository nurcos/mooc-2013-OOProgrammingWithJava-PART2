package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Notice Board");
        frame.setPreferredSize(new Dimension(400, 200));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JLabel copyTo = new JLabel();
        JTextField copyFrom = new JTextField("I was copied here from JTextArea.");
        JButton button = new JButton("Copy!");
        ActionEventListener copier = new ActionEventListener(copyFrom, copyTo);
        button.addActionListener(copier);
        
        container.add(copyFrom);
        container.add(button);
        container.add(copyTo);
        
    }
}
