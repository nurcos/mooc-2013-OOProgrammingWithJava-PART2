package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {

    private JTextField from;
    private JLabel to;
    
    public ActionEventListener(JTextField from, JLabel to){
        this.from = from;
        this.to = to;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.to.setText(this.from.getText());
        this.from.setText("");
    }
    
}
