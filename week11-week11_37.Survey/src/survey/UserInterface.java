package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(300, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container){
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        
        JCheckBox yesButton = new JCheckBox("Yes!");
        JCheckBox noButton = new JCheckBox("No!");
        
        ButtonGroup buttonGroupOne = new ButtonGroup();
        buttonGroupOne.add(yesButton);
        buttonGroupOne.add(noButton);
        
        container.add(yesButton);
        container.add(noButton);
        
        container.add(new JLabel("Why?"));
        
        JRadioButton buttonOne = new JRadioButton("No reason.");
        JRadioButton buttonTwo = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroupTwo = new ButtonGroup();
        buttonGroupTwo.add(buttonOne);
        buttonGroupTwo.add(buttonTwo);
        
        container.add(buttonOne);
        container.add(buttonTwo);
        
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
